package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectDropDownPage extends BasePage{
    public SelectDropDownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "select#dropdown option[value='2']")
    WebElement option;
    public SelectDropDownPage selectOption() {
        click(option);
        return new SelectDropDownPage(driver);
    }
}

