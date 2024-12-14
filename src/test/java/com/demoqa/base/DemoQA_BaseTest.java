package com.demoqa.base;

import com.demoqa.pages.HomePage;
import com.saucedemo.pages.SauceDemo_BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class DemoQA_BaseTest {
    protected WebDriver driver;
    protected SauceDemo_BasePage basepage;
    protected HomePage homepage;


    private String DEMOQA_URL = "https://demoqa.com/";

    @BeforeClass
    public void setUp() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(DEMOQA_URL);
        basepage = new SauceDemo_BasePage();
        basepage.setDriver(driver);
        homepage = new HomePage();
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}


