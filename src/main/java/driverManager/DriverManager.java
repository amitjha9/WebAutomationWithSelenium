package driverManager;

import browserManager.BrowserManager;
import browserManager.ChromeManager;
import browserManager.FirefoxManager;

public class DriverManager {

    public static BrowserManager getBrowserManager(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                return new ChromeManager();

            case "firefox":
                return new FirefoxManager();

            default:
                System.out.println("Not a valid browser type");
                throw new IllegalArgumentException("Unsupported browser Name:" + browser);
        }
    }
}
