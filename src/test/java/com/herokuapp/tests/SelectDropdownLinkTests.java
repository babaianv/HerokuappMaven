package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.SelectDropDownPage;
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
        new SelectDropDownPage(driver).selectOption();
    }
}

