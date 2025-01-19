package testcases;

import generics.SeleniumUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchOrangeTest extends BaseTest{

    SeleniumUtils seleniumUtils = new SeleniumUtils();

    @Test
    public void orangeHrmBrowserTitleTest() {
        String title = seleniumUtils.getPageTitle(driver);
        Assert.assertEquals(title,"OrangeHRM");
    }
}
