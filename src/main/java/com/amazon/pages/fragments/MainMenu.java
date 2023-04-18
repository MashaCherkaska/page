package com.amazon.pages.fragments;

import com.amazon.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainMenu extends AbstractPage {

    private static final By MY_ACCOUNT_ICON = By.id("nav-link-accountList");
    private static final By MY_CART_ICON = By.id("nav-cart-count-container");


    public MainMenu(WebDriver driver) {
        super(driver);
    }

    public WebElement getMyAccountIcon(){
        return driver.findElement(MY_ACCOUNT_ICON);
    }

    public WebElement getMyCartIcon(){
        return driver.findElement(MY_CART_ICON);
    }
}
