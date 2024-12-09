package com.saucedemo.pages;

import org.openqa.selenium.By;

public class ProductList_HomePage extends BasePage{
    private By productsHeader = By.xpath("//span[text()= 'Products']");

    public boolean isProductsHeaderDisplayed() {
        return find(productsHeader).isDisplayed();
    }



















}
