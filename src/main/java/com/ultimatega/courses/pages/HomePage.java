package com.ultimatega.courses.pages;

import com.ultimatega.courses.utility.UtilityClass;
import org.openqa.selenium.By;

public class HomePage extends UtilityClass {
    By signInLink = By.linkText("Sign In");

    public void clickOnSignLink() {
        clickOnElement(signInLink);

    }
}

