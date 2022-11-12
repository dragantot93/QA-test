package com.code.demoblaze.tests;

import com.code.demoblaze.models.User;
import com.code.demoblaze.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTests extends BaseTest {

    //Prvi zadatak
    @Test
    public void verifyLogIn() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);

        mainPage.openPage();
        Assert.assertFalse(mainPage.verifyIsWelcomeBtnPresent());

        mainPage.clickOnLogInOpener();
        mainPage.login(new User("test", "test"));

        Assert.assertTrue(mainPage.verifyIsWelcomeBtnPresent());


    }

    @Test
    public void verifyLogInWithoutUsername() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);

        mainPage.openPage();
        Assert.assertFalse(mainPage.verifyIsWelcomeBtnPresent());

        mainPage.clickOnLogInOpener();
        mainPage.login(new User("", "test"));
        String alertTextMsg = mainPage.getAlertTextMsg();
        mainPage.acceptAlert();

        Assert.assertEquals(alertTextMsg, "Please fill out Username and Password.");


    }

    @Test
    public void verifyLogInWithoutPassword() throws InterruptedException {

       MainPage mainPage = new MainPage(driver);

        mainPage.openPage();
        Assert.assertFalse(mainPage.verifyIsWelcomeBtnPresent());

        mainPage.clickOnLogInOpener();
        mainPage.login(new User("test", ""));
        String alertTextMsg = mainPage.getAlertTextMsg();
        mainPage.acceptAlert();

        Assert.assertEquals(alertTextMsg, "Please fill out Username and Password.");


    }

    @Test
    public void verifyLogInWithoutCredentials() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);

        mainPage.openPage();
        Assert.assertFalse(mainPage.verifyIsWelcomeBtnPresent());

        mainPage.clickOnLogInOpener();
        mainPage.login(new User("", ""));
        String alertTextMsg = mainPage.getAlertTextMsg();
        mainPage.acceptAlert();

        Assert.assertEquals(alertTextMsg, "Please fill out Username and Password.");


    }

    @Test
    public void verifyLogInWithWrongUsername() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);

        mainPage.openPage();
        Assert.assertFalse(mainPage.verifyIsWelcomeBtnPresent());

        mainPage.clickOnLogInOpener();
        mainPage.login(new User("LetsTest123", "123456"));
        String alertTextMsg = mainPage.getAlertTextMsg();
        mainPage.acceptAlert();

        Assert.assertEquals(alertTextMsg, "User does not exist.");


    }

    @Test
    public void verifyLogInWithWrongPassword() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);

        mainPage.openPage();
        Assert.assertFalse(mainPage.verifyIsWelcomeBtnPresent());

        mainPage.clickOnLogInOpener();
        mainPage.login(new User("test", "testtest123"));
        String alertTextMsg = mainPage.getAlertTextMsg();
        mainPage.acceptAlert();

        Assert.assertEquals(alertTextMsg, "Wrong password.");    }


}
