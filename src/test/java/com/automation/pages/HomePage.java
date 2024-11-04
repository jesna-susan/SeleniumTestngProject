package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@class=\"shopping_cart_link\"]")
    WebElement cartIcon;

    @FindBy(xpath = "//button[contains(@id,'add-to-cart')]")
    List<WebElement> addToCartIcon;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    WebElement cartIconNumber;

    @FindBy(id = "react-burger-menu-btn")
    WebElement hamburgerMenu;

    @FindBy(id="logout_sidebar_link")
    WebElement logoutBtn;


    public boolean isHomePageVisible(){
        return cartIcon.isDisplayed();
    }

    public void clickOnAddToCartIcon(){
        addToCartIcon.get(0).click();
    }

    public void clickOnShoppingCartIon(){
        cartIcon.click();
    }

    public boolean isCartIconOne() {
        String cartNumber = cartIconNumber.getText();
        return cartNumber.equals("1");
    }

    public void clickOnHamburger(){
        hamburgerMenu.click();
    }
    public void clickOnLogout(){
        logoutBtn.click();
    }

}
