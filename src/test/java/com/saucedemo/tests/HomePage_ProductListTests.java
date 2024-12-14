package com.saucedemo.tests;

import com.saucedemo.base.SauceDemo_BaseTest;
import com.saucedemo.pages.HomePage_ProductList;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage_ProductListTests extends SauceDemo_BaseTest {

    @Test
    public void validateProductsHeaderIsDisplayed() throws InterruptedException {
        HomePage_ProductList productpage = loginpage.logIntoApplication("standard_user", "secret_sauce");
        Assert.assertTrue(productpage.isProductsHeaderDisplayed(), "product header is not displayed");
        Thread.sleep(2000);
    }
























}
