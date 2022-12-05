package com.ultimatega.courses.pages;

import com.ultimatega.courses.utility.UtilityClass;
import org.openqa.selenium.By;

public class LoginPage extends UtilityClass {

    By welcomeText = By.xpath("//h1[normalize-space()='Welcome Back!']");

    By emailField =  By.id("user[email]");

    By passwordField = By.id("user[password]");

    By signInButton = By.xpath("//input[@type='submit']");

    By errorMessage = By.xpath("//li[@class='form-error__list-item']");
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);

    }
    public void enterEmailId(String email){
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }

    public void clickOnSignInButton(){
        clickOnElement(signInButton);


    }
    public String verifyErrorMessage(){
        return getTextFromElement(errorMessage);
    }




}