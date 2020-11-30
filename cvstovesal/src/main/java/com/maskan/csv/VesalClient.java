package com.maskan.csv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


import javax.xml.ws.WebServiceRef;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

@Component
@PropertySource("classpath:application.properties")
public class VesalClient {

    @Value("${max.thread.count}")
    private int maxThreadCount;
    @Value("${chunk.size}")
    private int chunkSize;
    @Value("${file.output.path}")
    private String fileOutputPath;

    private int localMaxThreadCount;

    public long sendManyToManyVesal(List<List<String>> records, UserManyToMany user) {
        List<String> textOriginators = new ArrayList<>();
        List<String> textDestinations = new ArrayList<>();
        List<String> textContents = new ArrayList<>();
        boolean isOk = true;
        int blockSize = ((records.size() - (records.size() % maxThreadCount)) / maxThreadCount);

        ExecutorService executor = Executors.newFixedThreadPool(maxThreadCount);
        int counter = 0;
        for (int i = 0; i < records.size(); i++) {
            ControllerCSV.percentage = ((i + 1) / records.size() * 100);
            textOriginators.add(records.get(i).get(0).trim());
            textDestinations.add(records.get(i).get(1));
            textContents.add(records.get(i).get(2));
            if (((i + 1) >= blockSize && Math.floorMod((i + 1), blockSize) == 0) || i == records.size() - 1) {
                Callable<List<VesalResult>> callable = new VesalServiceRunner(user.getUserName(), user.getPassword(), textOriginators, textDestinations, textContents, chunkSize);
                Future<List<VesalResult>> future = executor.submit(callable);
                try {
                    if (future.get().get(0).getErrorId() != 0) {
                        System.out.println(new Date() + " return value = " + future.get().get(0).getErrorId());
                        isOk = false;
                        break;
                    }
                    ControllerCSV.status = "Writing File";
                    fileWriter(future, user.getFilePath().getOriginalFilename());
                } catch (Exception ex) {
                    break;
                }
                textOriginators = new ArrayList<>();
                textDestinations = new ArrayList<>();
                textContents = new ArrayList<>();
            }
        }
        executor.shutdown();
        return isOk ? 0 : 1;
    }

  /*  public long sendManyToManyVesalOld(List<List<String>> records, UserManyToMany user) {
        localMaxThreadCount = maxThreadCount;
        List<String> textOriginators = new ArrayList<>();
        List<String> textDestinations = new ArrayList<>();
        List<String> textContents = new ArrayList<>();
        boolean isOk = true;

        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).get(0).trim().length() > 0 && records.get(i).get(1).trim().length() > 0 && records.get(i).get(2).trim().length() > 0) {
                textOriginators.add(records.get(i).get(0).trim());
                textDestinations.add(records.get(i).get(1));
                textContents.add(records.get(i).get(2));
            }
        }

        ExecutorService executor = Executors.newFixedThreadPool(localMaxThreadCount);
        if ((textDestinations.size() % localMaxThreadCount) == 0) {
            localMaxThreadCount -= 1;
        }
        for (int threadNum = 0; threadNum <= localMaxThreadCount; threadNum++) {
            Callable<List<VesalResult>> callable = new VesalServiceRunner(user.getUserName(), user.getPassword(), textOriginators, textDestinations, textContents, chunkSize, threadNum, localMaxThreadCount);
            Future<List<VesalResult>> future = executor.submit(callable);
            try {
                if (future.get().get(0).getErrorId() != 0) {
                    System.out.println(new Date() + ":: record count = " + (threadNum + 1) * chunkSize + " , return value = " + future.get().get(0).getErrorId());
                    isOk = false;
                    break;
                }
                ControllerCSV.status = "Writing File";
                fileWriter(future, user.getFilePath().getOriginalFilename());
            } catch (Exception ex) {
                break;
            }


        }
        executor.shutdown();
        return isOk ? 0 : 1;
    }*/

    public long sendOneToManyVesal(List<List<String>> records, User user) {
        List<String> textDestinations = new ArrayList<>();
        boolean isOk = true;
        int blockSize = ((records.size() - (records.size() % maxThreadCount)) / maxThreadCount);
        ExecutorService executor = Executors.newFixedThreadPool(maxThreadCount);
        int counter = 0;
        for (int i = 0; i < records.size(); i++) {
            ControllerCSV.percentage = ((i + 1) / records.size() * 100);
            textDestinations.add(records.get(i).get(0));
            if (((i + 1) >= blockSize && Math.floorMod((i + 1), blockSize) == 0) || i == records.size() - 1) {
                Callable<List<VesalResult>> callable = new VesalServiceRunnerOneToMany(user.getUserName(), user.getPassword(), user.getOriginator(), textDestinations, user.getContent(), chunkSize);
                Future<List<VesalResult>> future = executor.submit(callable);
                try {
                    if (future.get().get(0).getErrorId() != 0) {
                        System.out.println(new Date() + " return value = " + future.get().get(0).getErrorId());
                        isOk = false;
                        break;
                    }
                    ControllerCSV.status = "Writing File";
                    fileWriter(future, user.getFilePath().getOriginalFilename());
                } catch (Exception ex) {
                    break;
                }
                textDestinations = new ArrayList<>();
            }
        }
        executor.shutdown();
        return isOk ? 0 : 1;


    }

    public void fileWriter(Future<List<VesalResult>> listFuture, String fileName) throws IOException, ExecutionException, InterruptedException {
        FileOutputStream fos = new FileOutputStream(fileOutputPath + fileName, true);

        try (OutputStreamWriter osw = new OutputStreamWriter(fos,
                StandardCharsets.UTF_8)) {
            for (int i = 0; i < listFuture.get().size(); i++) {
                for (int j = 0; j < listFuture.get().get(i).getReferenceId().size(); j++) {
                    String text = String.valueOf(listFuture.get().get(i).getReferenceId().get(j));
                    text += "::";
                    text += String.valueOf(listFuture.get().get(i).getMobileNumber().get(j));
                    text += "::";
                    text += String.valueOf(listFuture.get().get(i).getSendDate());
                    osw.append(text + "\n");
                }
            }
        }
    }
}
