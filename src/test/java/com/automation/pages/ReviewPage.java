package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPage extends BasePage{
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton;

    public boolean isFinishButtonDisplayed(){
        return finishButton.isDisplayed();
    }

    public void clickOnFinishButton(){
        finishButton.click();
    }
}
