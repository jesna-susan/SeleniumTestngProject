package com.automation.test;

import com.automation.pages.Loginpage;
import com.automation.utils.ConfigReader;
import com.automation.utils.ExcelUtils;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class DataProvider extends BaseTest {

    @Test(dataProvider = "getValidCredentials")
    public void verifyUserCanLoginWithTheseCredentials(String username, String password){
        loginPage.openWebsite();
        loginPage.doLogin(username,password);
        Assert.assertTrue(homePage.isHomePageVisible());
    }

//    @org.testng.annotations.DataProvider
//    public Object[][] getInvalidData(){
//        String[][] credentials ={
//                {"standard_user", "secret_sauce"},
//                {"problem_user", "secret_sauce"},
//                {"performance_glitch_user", "secret_sauce"},
//                {"error_user", "secret_sauce"},
//                {"visual_user", "secret_sauce"},
//
//        };
//        return credentials;
//    }

    @org.testng.annotations.DataProvider
    public Object[][] getValidCredentials() {
        ExcelUtils excelUtils = new ExcelUtils("Selenium_data.xlsx", "ValidData");
        List<List<String>> tableData = excelUtils.getData();
        Object[][] data = new Object[tableData.size()][tableData.get(0).size()];

        for (int i = 0; i < tableData.size(); i++) {
            List<String> row = tableData.get(i);
            for (int j = 0; j < row.size(); j++) {
                data[i][j] = tableData.get(i).get(j);
            }
        }
        return data;
    }
}


