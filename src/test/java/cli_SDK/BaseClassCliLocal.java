package cli_SDK;

import Common.config;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClassCliLocal extends config {

    WebDriver driver;

    @BeforeClass
    public void setup(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--proxy-server=http://23.82.88.184:13733");
        driver= new ChromeDriver(options);
        driver.manage().window().maximize();
        System.out.println("Chrome Driver initiated");

    }

    @AfterClass
    public void tearDown(){

        driver.quit();

    }

}
