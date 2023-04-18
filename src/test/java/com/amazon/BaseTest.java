package com.amazon;

import com.amazon.drivermanagers.WebDriverFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected static WebDriver driver;

    @BeforeAll
    public static void init(){
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterAll
    public static void quitDriver(){
        driver.quit();
    }
}
