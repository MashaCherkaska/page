package com.amazon.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitersManager {

    private static final int TIME_OUT = 4;

    private WaitersManager(){}


    public static WebElement waitUntilElementIsVisible(WebDriver driver, By selector){
        return new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT))
                .until(ExpectedConditions.visibilityOf(driver.findElement(selector)));
    }

    public static WebElement waitUntilElementIsClickable(WebDriver driver, By selector){
        return new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT))
                .until(ExpectedConditions.elementToBeClickable(driver.findElement(selector)));
    }



}
