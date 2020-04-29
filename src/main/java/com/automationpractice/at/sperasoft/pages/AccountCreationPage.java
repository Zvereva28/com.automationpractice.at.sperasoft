package com.automationpractice.at.sperasoft.pages;

import com.automationpractice.at.sperasoft.pages.base.BasePage;
import com.automationpractice.at.sperasoft.pages.base.OpenUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AccountCreationPage extends BasePage{

    @FindBy(css = "")
    protected WebElement jhgsugys;

    public AccountCreationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }










}
