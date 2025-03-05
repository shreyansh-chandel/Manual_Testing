package cli_SDK;

import io.github.lambdatest.SmartUISnapshot;
import org.testng.annotations.Test;

import java.util.HashMap;
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

}
