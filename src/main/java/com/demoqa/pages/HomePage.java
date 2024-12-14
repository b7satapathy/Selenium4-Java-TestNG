package com.demoqa.pages;

import org.openqa.selenium.By;

public class HomePage extends DemoQA_BasePage {

    private By ElementsCard = By.xpath("//h5[text()='Elements']");
    private By FormsCard = By.xpath("//h5[text()='Forms']");
    private By AlertsCard = By.xpath("//h5[text()='Alerts,Frame & Windows']");
    private By WidgetsCard = By.xpath("//h5[text()='Widgets']");
    private By InteractionsCard = By.xpath("//h5[text()='Interactions']");
    private By BookStoreAppCard = By.xpath("//h5[text()='Book Store Application']");

    public void clickElementsCard() {
        click(ElementsCard);
    }

    public void clickFormsCard() {
        click(FormsCard);
    }

    public void clickAlertsCard() {
        click(AlertsCard);
    }

    public void clickWidgetsCard() {
        click(WidgetsCard);
    }
    public void clickInteractionsCard() {
        click(InteractionsCard);
    }
    public void clickBookStoreAppCard() {
        click(BookStoreAppCard);
    }


}
