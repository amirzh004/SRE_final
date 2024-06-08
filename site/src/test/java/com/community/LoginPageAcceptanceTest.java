package com.community;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class LoginPageAcceptanceTest {

    private WebDriver driver;

    @Before
    public void setUp() throws IOException {
        // Set ChromeDriver path dynamically
        System.setProperty("webdriver.chrome.driver", "/tmp/chromedriver");

        // Set options for headless testing (optional)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        driver = new ChromeDriver(options);
    }

    @Test
    public void testLoginPage() {
        driver.get("https://35.157.75.60:8443/login");
        // Example assertion to verify the page title
        assertEquals("Login - DemoSite", driver.getTitle());
        // Add more assertions and interactions as needed
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}