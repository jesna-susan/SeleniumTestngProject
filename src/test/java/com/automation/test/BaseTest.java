package com.automation.test;

import com.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

    @BeforeTest
    public void onSetUp(){
        DriverManager.createDriver();
    }

    @AfterTest
    public void cleanUp(){
        DriverManager.getDriver().quit();
    }
}
