package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@class=\"shopping_cart_link\"]")
    WebElement cartIcon;

    @FindBy(xpath = "//button[contains(@id,'add-to-cart')]")
    List<WebElement> addToCartIcon;

    public boolean isHomePageVisible(){
        return cartIcon.isDisplayed();
    }

    public void clickOnAddToCartIcon(){
        addToCartIcon.get(0).click();
    }

    public void clickOnShoppingCartIon(){
        cartIcon.click();
    }
}
