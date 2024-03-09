package com.herokuapp.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class AlertsPage extends BasePage{
    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[@style='list-style-type: none;']/li/button[@onclick='jsAlert()']")
    WebElement buttonAlert;
    public AlertsPage clickByAlertJSAlert() {
        click(buttonAlert);
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.alertIsPresent()).accept();
        return this;
    }


    @FindBy(xpath = "//ul[@style='list-style-type: none;']/li/button[@onclick='jsConfirm()']")
    WebElement confirmButton;

    public AlertsPage selectResult(String confirm) {
        click(confirmButton);
        if (confirm != null && confirm.equals("OK")){
            driver.switchTo().alert().accept();
        } else if (confirm != null && confirm.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(id = "result")
    WebElement confirmResult;
    public AlertsPage  verifyResult(String result) {
        Assert.assertTrue(confirmResult.getText().contains(result));

        return this;
    }

    @FindBy(xpath = "//ul[@style='list-style-type: none;']/li/button[@onclick='jsPrompt()']")
    WebElement promtButton;

    public AlertsPage sendMessageToAlert(String message) {
        click(promtButton);
        if (message != null){
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }

        return this;
    }

    @FindBy(id = "result")
    WebElement promptResult;
    public AlertsPage verifyMessage(String text ) {
        Assert.assertTrue(promptResult.getText().contains(text));
        return this;
    }

}

