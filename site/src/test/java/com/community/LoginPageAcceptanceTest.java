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
        File chromeDriver = new File("/tmp/chromedriver");
        if (!chromeDriver.exists()) {
            FileUtils.copyURLToFile(
                new URL("https://chromedriver.storage.googleapis.com/114.0.5735.90/chromedriver_linux64.zip"),
                new File("/tmp/chromedriver.zip")
            );
            Runtime.getRuntime().exec("unzip /tmp/chromedriver.zip -d /tmp/");
            new File("/tmp/chromedriver").setExecutable(true);
        }

        System.setProperty("webdriver.chrome.driver", "/tmp/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

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
