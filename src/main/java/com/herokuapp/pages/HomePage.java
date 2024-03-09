package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "JavaScript Alerts")
    WebElement javaScriptAlertsLink;

    public HomePage findAndOpenJavaScriptAlerts() {
        click(javaScriptAlertsLink);
        return this;
    }

    @FindBy(xpath = "//a[contains(@href, '/windows')]")
    WebElement multipleWindowsLink;
    public HomePage findAndOpenMultipleWindowsLink() {
        click(multipleWindowsLink);
        return this;
    }

}

