package com.automationpractice.at.sperasoft.pages;

import com.automationpractice.at.sperasoft.pages.base.BasePage;
import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class MyAccountPage extends BasePage {

    @FindBy(css = "[class=\"icon-list-ol\"]")
    private WebElement buttonHistoryOrder;

    @FindBy(css = "[class=\"icon-ban-circle\"]")
    private WebElement buttonMyCreditSlips;

    @FindBy(css = "[class=\"icon-building\"]")
    private WebElement buttonMyAddresses;

    @FindBy(css = "[class=\"icon-user\"]")
    private WebElement buttonMyPersonalInformation;

    @FindBy(css = "[class=\"icon-heart\"]")
    private WebElement buttonMyWishLists;

public MyAccountPage checkMyAccountPageIsDisplayed(){
    Assert.assertTrue(buttonHistoryOrder.isDisplayed(), "Не отобразилась кнопка HistoryOrder");
    Assert.assertTrue(buttonMyCreditSlips.isDisplayed(), "Не отобразилась кнопка MyCreditSlips");
    Assert.assertTrue(buttonMyAddresses.isDisplayed(), "Не отобразилась кнопка MyAddresses");
    Assert.assertTrue(buttonMyPersonalInformation.isDisplayed(), "Не отобразилась кнопка MyPersonalInformation");
    Assert.assertTrue(buttonMyWishLists.isDisplayed(), "Не отобразилась кнопка MyWishLists");

    return this;
}




    public MyAccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
