package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    @FindBy(id = "checkout")
    WebElement  checkoutButton;

    public boolean isChekoutButtonDislayed(){
        return checkoutButton.isDisplayed();
    }

    public void clickCheckout(){
        checkoutButton.click();
    }
}
