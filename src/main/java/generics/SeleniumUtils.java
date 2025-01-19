package generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtils {

    public String getPageTitle(WebDriver driver) {
        try {
            String title = driver.getTitle();
            System.out.println("Successfully retrieved the page title: " + title);
            return title;
        } catch (Exception e) {
            System.err.println("Exception while retrieving the page title:" + e.getMessage());
            return null;
        }
    }

    public String getCurrentURL(WebDriver driver) {
        try {
            String currentURL = driver.getTitle();
            System.out.println("Successfully retrieved the page current URL: " + currentURL);
            return currentURL;
        } catch (Exception e) {
            System.err.println("Exception while retrieving the page current URL:" + e.getMessage());
            return null;
        }
    }

    public String getPageSource(WebDriver driver) {
        try {
            String pageSource = driver.getTitle();
            System.out.println("Successfully retrieved the page source: " + pageSource);
            return pageSource;
        } catch (Exception e) {
            System.err.println("Exception while retrieving the page source:" + e.getMessage());
            return null;
        }
    }

    public void clickElement(WebDriver driver, WebElement element) {

    }

    public void enterText(WebDriver driver, By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    public String getElementText(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        return element.getText();
    }

    public String getElementAttribute(WebDriver driver, By locator, String attribute) {
        WebElement element = driver.findElement(locator);
        return element.getDomAttribute(attribute);
    }

    public WebElement waitForElement(WebDriver driver, By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForElementClickable(WebDriver driver, By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void selectDropDownByVisibleText(WebDriver driver, By locator, String visibleText) {
        WebElement element = driver.findElement(locator);
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    public void selectDropDownByValue(WebDriver driver, By locator, String value) {
        WebElement element = driver.findElement(locator);
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void selectDropDownByIndex(WebDriver driver, By locator, int index) {
        WebElement element = driver.findElement(locator);
        Select select = new Select(element);
        select.selectByIndex(index);
    }
}
