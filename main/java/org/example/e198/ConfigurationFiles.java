package org.example.e198;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ConfigurationFiles {
    public static void main(String[] args) {

       ConfigReader configReader = new ConfigReader();
        // Retrieve configuration values
        String browser = configReader.getBrowser();
        String url = configReader.getUrl();
        int implicitWait = configReader.getImplicitWait();

        WebDriver driver;

        // Set up WebDriver based on the browser type
        if (browser.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Invalid browser: " + browser);
        }


        // Configure WebDriver settings using Duration (Selenium 4+)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
        driver.get(url);

        // Print the configuration for confirmation
        System.out.println("Browser: " + browser + " URL: " + url + " Implicit Wait: " + implicitWait + " seconds");

        // Your test steps here...

        // Close the browser
        driver.quit();




    }
}

