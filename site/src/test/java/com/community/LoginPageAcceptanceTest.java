package com.community;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;

public class LoginPageAcceptanceTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        
        driver = new ChromeDriver(options);
    }

    @Test
    public void testLoginPage() {
        driver.get("https://35.157.75.60:8443/login");
        assertEquals("Login - DemoSite", driver.getTitle());
        }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
