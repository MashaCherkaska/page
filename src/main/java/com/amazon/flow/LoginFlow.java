package com.amazon.flow;

import com.amazon.flow.commonflow.BaseFlow;
import com.amazon.pages.mainpages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginFlow extends BaseFlow {

    private LoginPage loginPage;

    public LoginFlow(WebDriver driver){
        super(driver);
        loginPage = new LoginPage(driver);
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }


    public void setEmailAppField(String emailAppField){
        loginPage.getEmailField()
                .sendKeys(emailAppField);
    }

    public void clickEmailAppField(String emailAppField){
        loginPage.getEmailField()
                .click();
    }

    public void setPasswordField(String passwordField){
        loginPage.getPasswordField()
                .sendKeys(passwordField);
    }

    public void clickContinueButton(){
        loginPage.getContinueButton()
                .click();
    }

    public String getMissingEmailErrorText(){
        return loginPage.getMissingEmail().getText();
    }

    public String getWrongEmailErrorText(){
        return loginPage.getWrongEmail().getText();
    }

    public boolean isEmailMissingErrorDisplayed(){
        return loginPage.getMissingEmail().isDisplayed();
    }

    public boolean isFieldPasswordDisplayed(){
        return loginPage.getPasswordField().isDisplayed();
    }

    public boolean isEmailWrongErrorDisplayed(){
        return loginPage.getWrongEmail().isDisplayed();
    }

    public void loginSuccess(String email){
        setEmailAppField(email);
        clickContinueButton();

    }
}
