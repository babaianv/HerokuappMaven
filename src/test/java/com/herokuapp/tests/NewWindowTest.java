package com.herokuapp.tests;


import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.NewWindowPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewWindowTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).findAndOpenMultipleWindowsLink();
    }

    @Test
    public void openNewTabTest(){
        new NewWindowPage(driver).switchToNextTab(1).shouldHaveText("New Window");
    }




}

