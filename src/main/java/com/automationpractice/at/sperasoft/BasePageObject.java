package com.automationpractice.at.sperasoft;

import org.openqa.selenium.WebDriver;

public abstract class BasePageObject {
    protected WebDriver driver;

    public BasePageObject(WebDriver driver){
        this.driver = driver;
    }

}
