package com.automation.test;

import com.automation.pages.*;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

    Loginpage loginPage;
    HomePage homePage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    ReviewPage reviewPage;
    ConfirmationPage orderConfirmationPage;


    @BeforeTest
    public void onSetUp(){
        ConfigReader.initConfig();

        DriverManager.createDriver();

        loginPage = new Loginpage();
        homePage = new HomePage();
        cartPage = new CartPage();
        checkoutPage = new CheckoutPage();
        reviewPage = new ReviewPage();
        orderConfirmationPage = new ConfirmationPage();


    }

    @AfterTest
    public void cleanUp(){
        DriverManager.getDriver().quit();
    }
}
