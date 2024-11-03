package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage extends BasePage{
    @FindBy(css = ".complete-header")
    WebElement confirmationMsg;


    public boolean isConfirmationPageDisplayed() {
        return confirmationMsg.isDisplayed();

    }
    public void printMessage(){
        System.out.println(confirmationMsg.getText());
    }
}
