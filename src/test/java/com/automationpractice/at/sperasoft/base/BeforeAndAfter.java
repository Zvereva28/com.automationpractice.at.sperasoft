package com.automationpractice.at.sperasoft.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public abstract class BeforeAndAfter {
//    protected WebDriver driver;
//
//@BeforeTest
//
//    void setUp(){
//        WebDriverManager.chromedriver().setup();
//
//        ChromeOptions options = new ChromeOptions();
//        //options.addArguments("--disable-notifications");
//        //options.addArguments("--disable-popup-blocking");
//        //options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
//    }
//@AfterTest
//    void terDown(){driver.quit();}

}
