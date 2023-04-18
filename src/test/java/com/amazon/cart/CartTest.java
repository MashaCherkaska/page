package com.amazon.cart;

import com.amazon.BaseTest;
import com.amazon.flow.CartFlow;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.amazon.utils.PopHelpers.closeCountryPopUpButton;

public class CartTest extends BaseTest {

    private CartFlow cartFlow = new CartFlow(driver);

    @BeforeEach
    public void navigatePageAndZoom(){
        driver.get("https://www.amazon.com/cart");
        driver.manage().window().maximize();
        closeCountryPopUpButton(driver);
    }

    @Test
    public void checkTitlePage(){
        cartFlow.getMainMenuFlow().navigateToCart();
        String expected = "Amazon.com Shopping Cart";
        Assertions.assertEquals(expected,driver.getTitle());
    }


    @AfterEach
    public void clean(){
        driver.manage().deleteAllCookies();
    }





}
