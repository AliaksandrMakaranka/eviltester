package com.eviltester;

import com.eviltester.config.WebDriverConfig;
import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            driver = WebDriverConfig.createChromeDriver();
            driver.get("https://www.example.com");
            System.out.println("Page title: " + driver.getTitle());
        } finally {
            WebDriverConfig.quitDriver(driver);
        }
    }
}