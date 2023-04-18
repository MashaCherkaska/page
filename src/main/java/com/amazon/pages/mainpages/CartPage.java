package com.amazon.pages.mainpages;

import com.amazon.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends AbstractPage {

    private static final By PAGE_HEADER = By.xpath("//h2");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPageHeader(){
        return driver.findElement(PAGE_HEADER);
    }
}
