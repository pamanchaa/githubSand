package com.example.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LaunchChromeTest {

    @Test
    public void testLaunchChrome() {
        // Automatically resolve the correct ChromeDriver version
        WebDriverManager.chromedriver().setup();

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        try {
            // Open a website
            driver.get("https://www.google.com");

            // Verify the page title
            String expectedTitle = "Google";
            String actualTitle = driver.getTitle();
            assertEquals(expectedTitle, actualTitle, "Page title should match!");

            System.out.println("Test Passed: Page title is " + actualTitle);

        } finally {
            // Close the browser
            driver.close();
        }
    }
}
