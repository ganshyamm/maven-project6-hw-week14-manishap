package com.ultimatega.courses.testsuite;

import com.google.common.base.Verify;
import com.ultimatega.courses.pages.HomePage;
import com.ultimatega.courses.pages.LoginPage;
import com.ultimatega.courses.testbase.BaseTest;
import org.omg.CORBA.DynAnyPackage.Invalid;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogisTest extends BaseTest {

    HomePage homepage = new HomePage();
    LoginPage loginpage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {

        homepage.clickOnSignLink();
        String expectedText = "Welcome Back!";
        String actualText = loginpage.getWelcomeText();
        Assert.assertEquals(actualText, expectedText, "Welcome Back!");

    }

    @Test

    public void verifyTheErrorMessage() {

        homepage.clickOnSignLink();
        loginpage.enterEmailId("prime@gmail.com");
        loginpage.enterPassword("test123");
        loginpage.clickOnSignInButton();

        String expectedText = "Invalid email or password.";
        String actualText = loginpage.verifyErrorMessage();
        Assert.assertEquals(actualText, expectedText, "Invalid email or password.");


    }

}