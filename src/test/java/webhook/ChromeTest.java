package webhook;

import cli_SDK.BaseClassCliCloud;
import org.testng.annotations.Test;

public class ChromeTest extends BaseClassWebhook {

    @Test
    public void test01() throws InterruptedException {
        System.out.println("Loading Url");

        driver.get("https://www.lambdatest.com/");
        Thread.sleep(5000);

        driver.executeScript("smartui.takeScreenshot=home-page");
        Thread.sleep(1000);

        driver.get("https://www.lambdatest.com/pricing");
        Thread.sleep(5000);

        driver.executeScript("smartui.takeScreenshot=pricing-page");
        Thread.sleep(1000);

        driver.get("https://www.lambdatest.com/support/docs/");
        Thread.sleep(5000);
        driver.executeScript("smartui.takeScreenshot=docs");
        System.out.println("TestNGSmartUIChrome TestFinished");
    }

}
