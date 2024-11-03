package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
    @FindBy(xpath = "//span[@class='title'][contains(text(),'Checkout')]")
    WebElement checkoutPage;
    @FindBy(id = "first-name")
    WebElement firstName;
    @FindBy(id = "last-name")
    WebElement lastName;
    @FindBy(id = "postal-code")
    WebElement zipCode;
    @FindBy(id = "continue")
    WebElement continueButton;



    public boolean isCheckoutPageDisplayed(){
        return checkoutPage.isDisplayed();
    }

    public void sendInput(String fname,String lname,String postalCode){
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        zipCode.sendKeys(postalCode);
    }

    public void clickOnContinueButton(){
        continueButton.click();
    }
}
