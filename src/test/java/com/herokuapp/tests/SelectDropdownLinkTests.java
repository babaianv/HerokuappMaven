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
    }

    @Test
    public void selectOption(){
        SelectDropDownPage selectDropDownPage = new SelectDropDownPage(driver);
        selectDropDownPage.selectOption("Option 1");

        String selectedOption = selectDropDownPage.getSelectedOption();
        Assert.assertEquals(selectedOption, "Option 1", "The selected option is not expected");
    }




}

