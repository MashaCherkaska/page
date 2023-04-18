package com.amazon.pages.mainpages;

import com.amazon.pages.AbstractPage;
import com.amazon.utils.WaitersManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends AbstractPage {


    private static final By EMAIL_APP_FIELD = By.xpath("//input[@id='ap_email']");
    private static final By CONTINUE_BUTTON = By.id("continue");
    private static final By MISSING_EMAIL = By.xpath("//div[@id='auth-email-missing-alert']/div");
    private static final By WRONG_EMAIL = By.xpath("//h4[@class='a-alert-heading']");
    private static final By PASSWORD_FIELD = By.xpath("//input[@id='ap_password']");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailField() {
        return WaitersManager.waitUntilElementIsVisible(driver, EMAIL_APP_FIELD);
    }

    public WebElement getContinueButton() {
        return WaitersManager.waitUntilElementIsClickable(driver, CONTINUE_BUTTON);
    }

    public WebElement getMissingEmail() {
        return driver.findElement(MISSING_EMAIL);
    }

    public WebElement getWrongEmail() {
        return driver.findElement(WRONG_EMAIL);
    }

    public WebElement getPasswordField(){
        return driver.findElement(PASSWORD_FIELD);
    }


}
