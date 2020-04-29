package com.automationpractice.at.sperasoft.pages;

import com.automationpractice.at.sperasoft.pages.base.BasePage;
import com.automationpractice.at.sperasoft.pages.base.OpenUrl;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends BasePage implements OpenUrl {


    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public OpenUrl openUrl() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        return this;
    }
}
