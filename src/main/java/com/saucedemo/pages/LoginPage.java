package com.saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage =By.cssSelector("#login_button_container h3");

    public void setUsername(String username) {
        set(usernameField, username);
    }

    public void setPassword(String password) {
        set(passwordField, password);
    }

    public ProductList_HomePage clickLoginButton() {
        click(loginButton);
        return new ProductList_HomePage();
    }

    public ProductList_HomePage logIntoApplication(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public String getErrorMessage() {
        return find(errorMessage).getText();
    }

    public String getUsernamePlaceholder() {
        return find(usernameField).getAttribute("placeholder");
    }

    public String getPasswordPlaceholder() {
        return find(passwordField).getAttribute("placeholder");
    }




















}