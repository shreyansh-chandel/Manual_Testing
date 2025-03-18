package cli_SDK;

import io.github.lambdatest.SmartUISnapshot;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalTest extends BaseClassCliLocal {

    @Test
    public void test01() throws Exception {
        System.out.println("Loading Url");
        driver.get("https://www.lambdatest.com/support/docs/");
        Thread.sleep(1000);
        SmartUISnapshot.smartuiSnapshot(driver, "docs");
        Thread.sleep(5000);
        driver.get("https://www.lambdatest.com");
        Thread.sleep(1000);
        SmartUISnapshot.smartuiSnapshot(driver, "homepage");
        Thread.sleep(1000);
        System.out.println("Test Finished");
    }

    @Test
    public void test02() throws Exception {
        driver.get("https://www.kayak.co.in/privacy");
        SmartUISnapshot.smartuiSnapshot(driver, "kayak01");
    }

    @Test
    public void test03() throws Exception {
        driver.get("https://www.kayak.co.in/c/company/");
        Map<String,Object> config= new HashMap<>();
        config.put("loadDomContent",true);
        SmartUISnapshot.smartuiSnapshot(driver,"kayak01", config);
    }

    @Test
    public void test04() throws Exception {
        driver.get("https://www.kayak.co.in");
        SmartUISnapshot.smartuiSnapshot(driver,"kayak01");
    }

    @Test
    public void test05() throws Exception {
        Map<String, Object> ignoreOptions = new HashMap<>();
        List<String> ignoreID = Arrays.asList("api-requests");
        List<String> ignoreCSSSelectors = Arrays.asList(".overflow-hidden section:first-of-type",
                ".overflow-hidden section:nth-of-type(2)", "section:nth-of-type(6) .swiper", "section:nth-of-type(7) .swiper");
        Map<String, List<String>> ignoreDOM = new HashMap<>();
        ignoreDOM.put("id", ignoreID);
        ignoreDOM.put("cssSelector", ignoreCSSSelectors);
        ignoreOptions.put("ignoreDOM", ignoreDOM);
        driver.get("https://ipinfo.io/");
        SmartUISnapshot.smartuiSnapshot(driver,"kayak02",ignoreOptions);
    }

    @Test
    public void test06() throws Exception {
        driver.get("https://www.awwwards.com/websites/css3/");
        Map<String,Object> config= new HashMap<>();
        config.put("loadDomContent",true);
//        config.put("allowedHostnames",new String[]{"assets.awwwards.com"});
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo()");
        Thread.sleep(2000);
//        SmartUISnapshot.smartuiSnapshot(driver,"heavyPage01",config);
    }

    @Test
    public void test07() throws Exception {
        driver.get("https://www.amazon.in/");
        Map<String,Object> config= new HashMap<>();
        config.put("loadDomContent",true);
        SmartUISnapshot.smartuiSnapshot(driver,"amazonHomePage01",config);
    }

    @Test
    public void localTunnel() throws Exception {
        driver.get("http://localhost:3000/");
        Thread.sleep(3000);
    }

    @Test
    public void atyponTunnel() throws Exception {
        String[] urls1= new String[]{
                "https://econtent.hogrefe.com/exams/zkjp",
                "https://econtent.hogrefe.com/exam/kij/info",
                "https://econtent.hogrefe.com/action/doSearch?AllField=LastModified:",
                "https://econtent.hogrefe.com/action/showLogin?redirectUri=%2Fdoi%2Ffull%2F10.1026%2F0932-4089.50.3.163",
                "https://econtent.hogrefe.com/action/showPublications",
                "https://econtent.hogrefe.com/doi/10.1024/2235-0977/a000331",
                "https://econtent.hogrefe.com/exams/praxis",
                "https://econtent.hogrefe.com/action/updateInstitutionUsageReport",
                "https://econtent.hogrefe.com/exams/psychotherapy",
                "https://econtent.hogrefe.com/exams",
                "https://econtent.hogrefe.com/action/showInstitutionUsageReport",
                "https://econtent.hogrefe.com/doi/full/10.1024//1011-6877.13.34.173",
                "https://econtent.hogrefe.com/action/showLogin?redirectUri=%2Faction%2FshowCart%3FFlowID%3D2",
                "https://econtent.hogrefe.com/action/doSearch?AllField=*%3A*&ConceptID=&pageSize=20&startPage=100",
                "https://econtent.hogrefe.com/action/ssostart",
                "https://econtent.hogrefe.com/action/showLogin?redirectUri=%2Fwat",
                "https://econtent.hogrefe.com/doi/10.1027/1192-5604/a000099",
                "https://econtent.hogrefe.com/doi/10.1027/1192-5604/a000099",
                "https://econtent.hogrefe.com/action/showAlertSettings?isAddCitationAlert=true#citAlerts",
                "https://econtent.hogrefe.com/action/showPreferences?menuTab=AccountInfo",
                "https://econtent.hogrefe.com/doi/10.1027/2192-0923/a000239",
                "https://econtent.hogrefe.com/doi/10.1027/1015-5759.12.1.72",
                "https://econtent.hogrefe.com/action/showLogin?",
                "https://econtent.hogrefe.com/action/doSearch?",
                "https://econtent.hogrefe.com/action/showLogin",
                "https://econtent.hogrefe.com/doi/abs/10.1027/1864-9335/a000202",
                "https://econtent.hogrefe.com/doi/abs/10.1027/1864-9335/a000202",
                "https://econtent.hogrefe.com/action/registration",
                "https://econtent.hogrefe.com/doi/full/10.1027//1016-9040.4.2.59",
                "https://web.facebook.com/sharer/sharer.php?u=https%3A%2F%2Fecontent.hogrefe.com%2Fdoi%2F10.1024%2F1661-",
                "https://econtent.hogrefe.com/",
                "https://econtent.hogrefe.com/action/showPublications",
                "https://econtent.hogrefe.com/journal/cri",
                "https://econtent.hogrefe.com/loi/dia/group/d2000.y2009",
                "https://econtent.hogrefe.com/toc/zfb/3/3",
                "https://econtent.hogrefe.com/doi/10.1027/1192-5604/a000099",
                "https://econtent.hogrefe.com/doi/10.1027/0227-5910/a000715",
                "https://econtent.hogrefe.com/doi/10.1026/0012-1924/a000244",
                "https://econtent.hogrefe.com/doi/10.1026/0012-1924/a000244",
                "https://econtent.hogrefe.com/doi/10.1026/0012-1924/a000244",
                "https://econtent.hogrefe.com/doi/epdf/10.1024/2673-8627/a000020",
                "https://econtent.hogrefe.com/doi/suppl/10.1027/1618-3169/a000260",
                "https://econtent.hogrefe.com/action/showPreferences?menuTab=Alerts",
                "https://econtent.hogrefe.com/action/doSearch?",
                "https://econtent.hogrefe.com/toc/aga/4/4",
                "https://econtent.hogrefe.com/topic/collections/psych?target=titleSearch&content=title",
                "https://econtent.hogrefe.com/doi/10.1024/1422-4917/a000971",
                "https://econtent.hogrefe.com/action/showPreferences?menuTab=Articles&type=favorite%2Ctitle&type=subscribed%2Ctitle",
                "https://econtent.hogrefe.com/doi/10.1027/1016-9040.12.3.206",
                "https://econtent.hogrefe.com/doi/full/10.1027/1614-0001/a000044"
        };

        String[] urls= new String[]{
        "https://asce-stag.literatumonline.com/",
                "https://asce-stag.literatumonline.com/doi/book/10.1061/9780784416105",
                "https://asce-stag.literatumonline.com/topic/ascebookseries/b-socpubs",
                "https://asce-stag.literatumonline.com/ebooks",
                "https://asce-stag.literatumonline.com/action/doSearch?AllField=engineer",
                "https://asce-stag.literatumonline.com/doi/10.1061/JAEEEZ.ASENG-5437",
                "https://asce-stag.literatumonline.com/",
                "https://asce-stag.literatumonline.com/doi/10.1061/(ASCE)IR.1943-4774.0000520",
                "https://asce-stag.literatumonline.com/action/showInstitutionAdminBanner",
                "https://asce-stag.literatumonline.com/doi/10.1061/%28ASCE%29GM.1943-5622.0000257",
                "https://asce-stag.literatumonline.com/action/showInstitutionAdminBanner?institutionUserId=520",
                "https://asce-stag.literatumonline.com/search/saved",
                "https://asce-stag.literatumonline.com/action/institutionMultiIpShow?institutionUUID=5941834b-3e88-44ea-97f6-745a2bdf22cd",
                "https://asce-stag.literatumonline.com/action/institutionMultiIpShow?institutionUUID=a0a40afd-57b6-4311-97bb-29ca69af32a4",
                "https://asce-stag.literatumonline.com/action/ssostart",
                "https://asce-stag.literatumonline.com/doi/10.1061/(ASCE)WR.1943-5452.0001492",
                "https://asce-stag.literatumonline.com/action/showAlertSettings?newContentAlert=true",
                "https://asce-stag.literatumonline.com/action/doSearch?AllField=engineer",
                "https://asce-stag.literatumonline.com/action/doSearch?AllField=0893-1321&startPage=&target=custom-page&content=websitePage",
                "https://asce-stag.literatumonline.com/admin/adSample.jsp?adId=1008",
                "https://asce-stag.literatumonline.com/action/doSearch?AllField=1943-5525&startPage=&target=custom-page&content=websitePage",
                "https://asce-stag.literatumonline.com/action/doSearch?field1=AllField&text1=engineer&field2=Title&text2=test&publication=&Ppub=&AllField=engineer&content=articlesChapters&target=default",
                "https://asce-stag.literatumonline.com/action/doSearch?field1=AllField&text1=engineer&field2=Title&text2=test&publication=&Ppub=&AllField=engineer&content=articlesChapters&target=default",
                "https://asce-stag.literatumonline.com/action/doSearch?AllField=test&startPage=0&sortBy=Earliest",
                "https://asce-stag.literatumonline.com/action/doSearch?AllField=Coordinated+Control+of+a+Tethered+Autonomous+Docking+UAV",
                "https://asce-stag.literatumonline.com/doi/10.1061/9780784415443"};
        int i=0;
        for(;i<urls1.length;i++){
            driver.get(urls1[i]);
            System.out.println("Open successfully "+i);
            SmartUISnapshot.smartuiSnapshot(driver,"Atypon-ss-"+i);
        }
        System.out.println(i);
    }

    @Test
    public void kayakTunnel() throws Exception {
        String[] urls= new String[]{
                "https://www.b.runwaynine.com/about",
                "https://www.b.runwaynine.com/careers",
                "https://momondo-kyk-wlde.affiliate.b.runwaynine.com/about",
                "https://momondo-kyk-wlde.affiliate.b.runwaynine.com/careers"
        };
        int i=1;
        for(String s:urls){
            driver.get(s);
            SmartUISnapshot.smartuiSnapshot(driver,"Kayak-ss-"+i++);
        }
    }

}
