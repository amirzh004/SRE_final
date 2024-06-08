package com.community;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static org.junit.Assert.assertEquals;

public class LoginPageAcceptanceTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Set GeckoDriver path dynamically
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");

        // Set options for headless testing
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        driver = new FirefoxDriver(options);
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
