package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {


    @Test
    public void validatePlaceholders() throws InterruptedException {
        String usernamePlaceholder = loginpage.getUsernamePlaceholder();
        String passwordPlaceholder = loginpage.getPasswordPlaceholder();

        Assert.assertEquals(usernamePlaceholder, "Username");
        Assert.assertEquals(passwordPlaceholder, "Password");
//        Thread.sleep(2000);
    }


    @Test
    public void testLoginErrorMessage() throws InterruptedException {

        loginpage.setUsername("standard_user");
        loginpage.setPassword("xyz1234");

//        Thread.sleep(2000);

        loginpage.clickLoginButton();
        String actualMessage= loginpage.getErrorMessage();
        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";

        Assert.assertEquals(actualMessage, expectedMessage);

    }





























    
}
