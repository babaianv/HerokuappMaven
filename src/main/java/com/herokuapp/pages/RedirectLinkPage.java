package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedirectLinkPage extends BasePage{
    public RedirectLinkPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='status_codes/200']")
    WebElement statusCode200;
    public RedirectLinkPage get200Link() {
        click(statusCode200);
        return new RedirectLinkPage(driver);
    }

    @FindBy(css = "[href='status_codes/301']")
    WebElement statusCode301;
    public RedirectLinkPage get301Link() {
        click(statusCode301);
        return new RedirectLinkPage(driver);
    }

    @FindBy(css = "[href='status_codes/404']")
    WebElement statusCode404;
    public RedirectLinkPage get404Link() {
        click(statusCode404);
        return new RedirectLinkPage(driver);
    }

    @FindBy(css = "[href='status_codes/500']")
    WebElement statusCode500;
    public RedirectLinkPage get500Link() {
        click(statusCode500);
        return new RedirectLinkPage(driver);
    }
}

