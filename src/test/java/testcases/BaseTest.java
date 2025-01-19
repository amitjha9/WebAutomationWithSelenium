package testcases;

import config.ReadConfig;
import driverManager.CreateDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    ReadConfig readConfig = new ReadConfig();
    String browserName = readConfig.getBrowserName();
    String baseURL = readConfig.getBaseURL();
    public WebDriver driver;

    @BeforeClass
    public void launchSetup() {
        CreateDriver.getInstance().setDriver(browserName);
        driver = CreateDriver.getInstance().getDriver();

        //Setup WebDriver Configurations
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(baseURL);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
