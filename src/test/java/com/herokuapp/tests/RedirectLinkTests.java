package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.RedirectLinkPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedirectLinkTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).findAndOpenRedirectLink();
        new RedirectLinkPage(driver).clickTriggerRedirectLink();
    }

    @Test
    public void getStatusCodeTest() {
        new RedirectLinkPage(driver).getStatusCode();
    }

}

