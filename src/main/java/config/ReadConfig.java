package config;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    Properties properties;
    String basePath = System.getProperty("user.dir");
    String filePath = basePath + "/src/test/resources/config.properties";

    public ReadConfig() {
        try {
            properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(filePath);
            properties.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getBrowserName() {
        String browserName = properties.getProperty("browserName");
        if (browserName != null) {
            return browserName;
        } else {
            throw new RuntimeException("Browser Name didn't find in the config properties file");
        }
    }

    public String getBaseURL() {
        String baseURL = properties.getProperty("baseURL");
        if (baseURL != null) {
            return baseURL;
        } else {
            throw new RuntimeException("Base URL didn't find in the config properties file");
        }
    }
}
