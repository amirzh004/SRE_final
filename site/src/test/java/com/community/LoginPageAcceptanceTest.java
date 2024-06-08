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
        System.out.println("Setting up WebDriver");
        driver = new HtmlUnitDriver(true);  // Enable JavaScript
        if (driver == null) {
            System.err.println("WebDriver initialization failed");
        }
    }

    @Test
    public void testLoginPage() {
        System.out.println("Starting testLoginPage");
        if (driver == null) {
            System.err.println("WebDriver is null in testLoginPage");
        } else {
            driver.get("https://35.157.75.60:8443/login");
            // Example assertion to verify the page title
            assertEquals("Login - DemoSite", driver.getTitle());
        }
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Tearing down WebDriver");
        if (driver != null) {
            driver.quit();
        } else {
            System.err.println("WebDriver is null in tearDown");
        }
    }
}
