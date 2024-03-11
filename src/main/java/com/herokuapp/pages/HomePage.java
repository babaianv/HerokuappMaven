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

    @FindBy(css = "[href='/dropdown']")
    WebElement  dropdownLink ;
    public HomePage findAndOpenDropdownLink() {
        click(dropdownLink);
        return this;
    }

    @FindBy(id = "dropdown")
    WebElement dropdown;
    public HomePage getSelectMenu() {
        click(dropdown);
        return this;
    }

    @FindBy(css = "[href='/redirector']")
    WebElement redirectorLink ;
    public HomePage findAndOpenRedirectLink() {
        click(redirectorLink);
        return this;
    }


    @FindBy(id = "redirect")
    WebElement redirectTriggerLink ;
    public HomePage clickTriggerRedirectLink() {
        click(redirectTriggerLink);
        return this;
    }


}

