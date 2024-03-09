package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class NewWindowPage extends BasePage{
    public NewWindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(@href, '/windows')]")
    WebElement multipleWindowsLink;
    public NewWindowPage findAndOpenMultipleWindowsLink() {
        click(multipleWindowsLink);
        return this;
    }

    @FindBy(xpath = "//a[@href='/windows/new']")
    WebElement newWindowLink;

    public NewWindowPage switchToNextTab(int index) {
        click(newWindowLink);
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        return this;
    }


    @FindBy(className = "example")
    WebElement textPage;

        public NewWindowPage shouldHaveText(String text) {

           Assert.assertTrue(textPage.getText().contains(text));
            return this;
    }

}

