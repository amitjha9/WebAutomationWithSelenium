package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchOrangeTest extends BaseTest{


    @Test
    public void orangeHrmBrowserTitleTest() {
        launchSetup();
        String title = driver.getTitle();
        System.out.println("Title of the page is:" +title);
        Assert.assertEquals(title,"OrangeHRM");
    }
}
