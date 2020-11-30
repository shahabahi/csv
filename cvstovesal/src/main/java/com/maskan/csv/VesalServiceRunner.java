package com.maskan.csv;

import com.maskan.csv.ws.MessageRelay;
import com.maskan.csv.ws.ReferenceResult;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

public class VesalServiceRunner implements Callable {
    String userName;
    String userPass;
    List<String> textOriginators;
    List<String> textDestinations;
    List<String> textContents;
    int chunkSize;

    public VesalServiceRunner(String userName, String userPass, List<String> textOriginators, List<String> textDestinations, List<String> textContents, int chunkSize) {
        this.userName = userName;
        this.userPass = userPass;
        this.textOriginators = textOriginators;
        this.textDestinations = textDestinations;
        this.textContents = textContents;
        this.chunkSize = chunkSize;
    }

    @Override
    public Object call() {
        List<String> lTextDestinations = new ArrayList<>();
        List<String> lTextContents = new ArrayList<>();
        List<String> lTextOriginator = new ArrayList<>();
        List<VesalResult> vesalResultList = new ArrayList<VesalResult>();
        int num = 0;

        for (int i = 0; i < textOriginators.size(); i++) {
            ControllerCSV.status = "Record Number " + i;
            lTextDestinations.add(textDestinations.get(i));
            lTextContents.add(textContents.get(i));
            lTextOriginator.add(textOriginators.get(i));
            if (((i + 1) >= chunkSize && (i + 1) % chunkSize == 0) || i == textDestinations.size() - 1) {

                AnnotationConfigApplicationContext context
                        = new AnnotationConfigApplicationContext(SpringContextConfig.class);

                MessageRelay myServiceA_WsCall =
                        context.getBean(MessageRelay.class);

                /* System.out.println(lTextContents.toString());*/

                ReferenceResult referenceResult = myServiceA_WsCall.sendMessageManyToMany(userName, userPass, lTextOriginator, lTextDestinations, lTextContents);
                context.close();
                VesalResult vesalResult = new VesalResult();
                vesalResult.setMobileNumber(lTextDestinations);
                vesalResult.setReferenceId(referenceResult.getReferences());
                vesalResult.setErrorId(referenceResult.getError().getErrorCode());
                vesalResult.setSendDate(new Date());
                vesalResultList.add(vesalResult);
                if (referenceResult.getError().getErrorCode() != 0) {
                    break;
                }
                lTextDestinations = new ArrayList<>();
                lTextContents = new ArrayList<>();
                lTextOriginator = new ArrayList<>();
                if (i == textDestinations.size() - 1) {
                    break;
                }
            }

        }
        return vesalResultList;
    }
}
