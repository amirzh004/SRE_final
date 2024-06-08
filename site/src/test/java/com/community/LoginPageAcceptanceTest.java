package com.community;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.Assert.assertEquals;

public class LoginPageAcceptanceTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new HtmlUnitDriver(true);  // Enable JavaScript
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
