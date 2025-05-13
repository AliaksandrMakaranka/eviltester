package com.eviltester;

import com.eviltester.config.WebDriverConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {
    private WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = WebDriverConfig.createChromeDriver();
    }

    @Test
    public void testExampleWebsite() {
        driver.get("https://www.example.com");
        assertEquals("Example Domain", driver.getTitle());
    }

    @AfterEach
    public void tearDown() {
        WebDriverConfig.quitDriver(driver);
    }
} 