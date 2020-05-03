package com.automationpractice.at.sperasoft.blocks;

import com.automationpractice.at.sperasoft.BasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class HeaderBlock extends BasePageObject {

    @FindBy(css = "[class=\"navigation_page\"]")
    private WebElement headerTitlePage;

    public HeaderBlock(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //проверка  имени страницы:
    public HeaderBlock checkNamePage(String exampleNamePage) {
        ExpectedConditions.textToBePresentInElement(headerTitlePage, exampleNamePage);
        String headerPageText = headerTitlePage.getText();
        Assert.assertTrue(headerPageText.equalsIgnoreCase(exampleNamePage));
        return this;
    }
}
