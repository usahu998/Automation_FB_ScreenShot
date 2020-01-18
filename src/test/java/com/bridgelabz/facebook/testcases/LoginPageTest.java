package com.bridgelabz.facebook.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bridgelabz.facebook.base.BaseClass;
import com.bridgelabz.facebook.pages.LoginPage;
import com.bridgelabz.facebook.util.CustomListener;

@Listeners(CustomListener.class)
public class LoginPageTest extends BaseClass {

    public LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        initiation();
        loginPage = new LoginPage();

    }

    @Test(priority = 1)
    public void LoginTest() {
        loginPage.Login(property.getProperty("email"), property.getProperty("password"));
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
