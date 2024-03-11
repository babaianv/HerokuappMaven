package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.RedirectLinkPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedirectLinkTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).findAndOpenRedirectLink();
        new HomePage(driver).clickTriggerRedirectLink();
    }

    @Test
    public void open200Link(){
        new RedirectLinkPage(driver).get200Link();
        Assert.assertTrue(driver.getCurrentUrl().contains("status_codes/200"), "Not found");
    }

    @Test
    public void open301Link(){
        new RedirectLinkPage(driver).get301Link();
        Assert.assertTrue(driver.getCurrentUrl().contains("status_codes/301"), "Not found");
    }

    @Test
    public void open404Link(){
       new RedirectLinkPage(driver).get404Link();
       Assert.assertTrue(driver.getCurrentUrl().contains("status_codes/404"),"Not found");
    }

    @Test
    public void open500Link(){
        new RedirectLinkPage(driver).get500Link();
        Assert.assertTrue(driver.getCurrentUrl().contains("status_codes/500"), "Not found");
    }

}

