package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {
    @FindBy(id = "checkout")
    WebElement  checkoutButton;

    public boolean isChekoutButtonDislayed(){
        wait.until(ExpectedConditions.visibilityOf(checkoutButton));
        return checkoutButton.isDisplayed();
    }

    public void clickCheckout(){
        checkoutButton.click();
    }
}
