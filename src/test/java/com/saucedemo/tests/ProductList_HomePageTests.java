package com.saucedemo.tests;

import com.saucedemo.base.SauceDemo_BaseTest;
import com.saucedemo.pages.ProductList_HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductList_HomePageTests extends SauceDemo_BaseTest {

    @Test
    public void validateProductsHeaderIsDisplayed() throws InterruptedException {
        ProductList_HomePage productpage = loginpage.logIntoApplication("standard_user", "secret_sauce");
        Assert.assertTrue(productpage.isProductsHeaderDisplayed(), "product header is not displayed");
        Thread.sleep(2000);
    }
























}
