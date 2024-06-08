package com.community;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginPageAcceptanceTest {

    private WebDriver driver;

    @BeforeEach
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

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
