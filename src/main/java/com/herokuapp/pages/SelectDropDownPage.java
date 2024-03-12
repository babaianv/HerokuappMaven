package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectDropDownPage extends BasePage{
    public SelectDropDownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement option;
    public SelectDropDownPage selectOption(String selectOption) {
        Select select = new Select(option);
        select.selectByVisibleText(selectOption);

        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++){
            options.get(i).getText();
        }
        select.getFirstSelectedOption().getText();
        return this;
    }

    public String getSelectedOption() {
        Select select = new Select(option);
        return select.getFirstSelectedOption().getText();
    }



}

