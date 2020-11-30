package com.maskan.csv;

import com.maskan.csv.ws.MessageRelay;
import com.maskan.csv.ws.ReferenceResult;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

public class VesalServiceRunnerOneToMany implements Callable {
    String userName;
    String userPass;
    String textOriginator;
    List<String> textDestinations;
    String textContent;
    int chunkSize;

    public VesalServiceRunnerOneToMany(String userName, String userPass, String textOriginator, List<String> textDestinations, String textContent, int chunkSize) {
        this.userName = userName;
        this.userPass = userPass;
        this.textOriginator = textOriginator;
        this.textDestinations = textDestinations;
        this.textContent = textContent;
        this.chunkSize = chunkSize;
    }

    @Override
    public Object call() {
        List<String> lTextDestinations = new ArrayList<>();
        List<VesalResult> vesalResultList=new ArrayList<VesalResult>();
        int num = 0;

        for (int i = 0; i < textDestinations.size(); i++) {
            ControllerCSV.status = "Record Number " + i;
            lTextDestinations.add(textDestinations.get(i));
            if (((i + 1) >= chunkSize && (i + 1) % chunkSize == 0) || i == textDestinations.size() - 1) {

                AnnotationConfigApplicationContext context
                        = new AnnotationConfigApplicationContext(SpringContextConfig.class);

                MessageRelay myServiceA_WsCall =
                        context.getBean(MessageRelay.class);

                ReferenceResult referenceResult = myServiceA_WsCall.sendMessageOneToMany(userName, userPass, textOriginator, lTextDestinations, textContent);
                context.close();
                VesalResult vesalResult=new VesalResult();
                vesalResult.setMobileNumber(lTextDestinations);
                vesalResult.setReferenceId(referenceResult.getReferences());
                vesalResult.setErrorId(referenceResult.getError().getErrorCode());
                vesalResult.setSendDate(new Date());
                vesalResultList.add(vesalResult);
                if (referenceResult.getError().getErrorCode() != 0) {
                    break;
                }
                lTextDestinations = new ArrayList<>();
                if (i == textDestinations.size() - 1) {
                    break;
                }
            }

        }
        return vesalResultList;
    }
}
