package com.ultimatega.courses.testbase;

import com.ultimatega.courses.propertyreader.PropertyReader;
import com.ultimatega.courses.utility.UtilityClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends UtilityClass {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);

    }

    @AfterMethod
    public void teadDoen(){
        closebrowser();
    }

}
