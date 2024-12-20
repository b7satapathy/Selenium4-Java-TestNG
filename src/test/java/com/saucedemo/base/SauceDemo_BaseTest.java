package com.saucedemo.base;

import com.saucedemo.pages.SauceDemo_BasePage;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SauceDemo_BaseTest {
    protected WebDriver driver;
    protected SauceDemo_BasePage basepage;
    protected LoginPage loginpage;

    private String SAUCEDEMO_URL = "https://www.saucedemo.com/";

    @BeforeClass
    public void setUp() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(SAUCEDEMO_URL);
        basepage = new SauceDemo_BasePage();
        basepage.setDriver(driver);
        loginpage = new LoginPage();
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }


















}
