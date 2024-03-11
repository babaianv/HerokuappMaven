package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.SelectDropDownPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectDropdownLinkTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).findAndOpenDropdownLink();
        new HomePage(driver).getSelectMenu();
    }

    @Test
    public void selectOptionTest(){
        SelectDropDownPage selectDropDownPage = new SelectDropDownPage(driver);
        selectDropDownPage.selectOption();
        Assert.assertTrue(selectDropDownPage.isOptionSelected("Option 2"), "Option 1 is not selected");
    }
}

