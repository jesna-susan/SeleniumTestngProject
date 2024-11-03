package com.automation.test;

import com.automation.pages.*;
import com.automation.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class OrderConfirmationTest extends BaseTest {


    @Test
    public void login(){

        Loginpage loginPage= new Loginpage();
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"), ConfigReader.getConfigValue("login.password"));

        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.isHomePageVisible());
        homePage.clickOnAddToCartIcon();
        homePage.clickOnShoppingCartIon();

        CartPage cartPage = new CartPage();
        Assert.assertTrue(cartPage.isChekoutButtonDislayed());
        cartPage.clickCheckout();


        CheckoutPage checkoutPage = new CheckoutPage();
        Assert.assertTrue(checkoutPage.isCheckoutPageDisplayed());
        checkoutPage.sendInput(ConfigReader.getConfigValue("shipping.firstname"),ConfigReader.getConfigValue("shipping.lastname"),ConfigReader.getConfigValue("shipping.zipcode"));
        checkoutPage.clickOnContinueButton();

        ReviewPage reviewPage = new ReviewPage();
        Assert.assertTrue(reviewPage.isFinishButtonDisplayed());
        reviewPage.clickOnFinishButton();

        ConfirmationPage confirmationPage = new ConfirmationPage();
        Assert.assertTrue(confirmationPage.isConfirmationPageDisplayed());
        confirmationPage.printMessage();


    }


}
