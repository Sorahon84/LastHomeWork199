package org.example.e198;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties properties;

    // Constructor to load the properties file
    public ConfigReader() {
        try {
            FileInputStream fis = new FileInputStream("Files/Config.properties");
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to get browser from properties file
    public String getBrowser() {
        return properties.getProperty("browser");
    }

    // Method to get URL from properties file
    public String getUrl() {
        return properties.getProperty("url");
    }

    // Method to get implicit wait time from properties file
    public int getImplicitWait() {
        return Integer.parseInt(properties.getProperty("implicitWait"));
    }

}
