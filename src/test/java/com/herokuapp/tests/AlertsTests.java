package com.herokuapp.tests;

import com.herokuapp.pages.AlertsPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).findAndOpenJavaScriptAlerts();
    }

    @Test
    public void clickByAlertJSAlertTest(){
        new AlertsPage(driver).clickByAlertJSAlert();
    }


    @Test
    public void selectResultTest(){
        new AlertsPage(driver).selectResult("Cancel").verifyResult("Cancel");
    }


    @Test
    public void sendMessageToAlertTest(){
        new AlertsPage(driver).sendMessageToAlert("Hallo World!").verifyMessage("Hallo World!");
    }

}

