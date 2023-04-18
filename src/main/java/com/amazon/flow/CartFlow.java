package com.amazon.flow;

import com.amazon.flow.commonflow.BaseFlow;
import com.amazon.pages.mainpages.CartPage;
import org.openqa.selenium.WebDriver;

public class CartFlow extends BaseFlow {

    private CartPage cartPage;

    public CartFlow(WebDriver driver) {
        super(driver);
        this.cartPage = new CartPage(driver);
    }

    public CartPage getCartPage() {
        return cartPage;
    }

    public String getHeaderText(){
        return cartPage.getPageHeader().getText();
    }
}
