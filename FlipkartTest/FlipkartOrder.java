package com.flipkart.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.base.BaseClass;
import com.flipkart.pages.HomePage;

public class FlipkartOrder extends BaseClass {

    HomePage home;

    @BeforeMethod
    public void launchBrowser() {

        setup();

        home = new HomePage(driver);
    }

    @Test
    public void orderFlowTest() {

        home.searchProduct("iPhone 15");
    }

    @AfterMethod
    public void closeBrowser() {

        tearDown();
    }
}