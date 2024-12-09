package com.saucedemo.base;

import com.saucedemo.pages.BasePage;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basepage;
    protected LoginPage loginpage;

    private String url= "https://www.saucedemo.com/";

    @BeforeClass
    public void setUp() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        basepage = new BasePage();
        basepage.setDriver(driver);
        loginpage = new LoginPage();
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }


















}
