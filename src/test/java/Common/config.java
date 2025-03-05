package Common;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class config {

    //***************************Common config***********************

    public String projectName= "Automation_02";
    public String ssName= "screenShot_01";


    public static String generateRandomString(int length) {
        final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        final SecureRandom RANDOM = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }

    //***************************Prod config*************************

    public Map<String,String> getProdConfig(){
        Map<String,String> stage= new HashMap<>();
        stage.put("userName","shreyanshc");
        stage.put("accessKey","LT_WUaUMWBJGtWoVK1Kq1XKgwPDT8QnZsPFP4Ue93cz69dUMsU");
        stage.put("hub","@hub.lambdatest.com/wd/hub");
        return stage;
    }

    //***************************Stage config************************

    public Map<String,String> getStageConfig(){
        Map<String,String> stage= new HashMap<>();
        stage.put("userName","shreyanshc");
        stage.put("accessKey","LT_BgJooFhOV3XInNXpJPwVuoXXI47Pte7SuReVtDkHgKYeHkq");
        stage.put("hub","@stage-hub.lambdatestinternal.com/wd/hub");
        return stage;
    }

}
