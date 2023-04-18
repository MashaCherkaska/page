package com.amazon.flow.commonflow;

import com.amazon.pages.fragments.MainMenu;
import org.openqa.selenium.WebDriver;

public class MainMenuFlow {

    private MainMenu mainMenu;

    public MainMenuFlow(WebDriver driver){
        mainMenu = new MainMenu(driver);
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

    public void navigateToCart(){
        mainMenu.getMyCartIcon().click();

    }

    public void navigateToAccount(){
        mainMenu.getMyAccountIcon().click();
    }
}
