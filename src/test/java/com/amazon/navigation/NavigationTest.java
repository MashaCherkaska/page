package com.amazon.navigation;

import com.amazon.BaseTest;
import com.amazon.flow.CartFlow;
import com.amazon.flow.LoginFlow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.amazon.utils.PopHelpers.closeCountryPopUpButton;

public class NavigationTest extends BaseTest {

    private LoginFlow loginFlow = new LoginFlow(driver);

    private CartFlow cartFlow = new CartFlow(driver);

    @BeforeEach
    public void openPage(){
        driver.get("https://www.amazon.com/cart");
        driver.manage().window().maximize();
        closeCountryPopUpButton(driver);
    }


    @Test
    public void testNavigateToAcc(){
        cartFlow.getMainMenuFlow().navigateToAccount();
        String expected = "Amazon Sign-In";
        Assertions.assertEquals(expected,driver.getTitle());
    }
}
