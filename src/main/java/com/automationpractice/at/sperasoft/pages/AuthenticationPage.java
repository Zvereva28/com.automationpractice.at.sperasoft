package com.automationpractice.at.sperasoft.pages;

import com.automationpractice.at.sperasoft.pages.base.BasePage;
import com.automationpractice.at.sperasoft.pages.base.OpenUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static java.lang.Thread.sleep;


public class AuthenticationPage extends BasePage implements OpenUrl {
//CREATE AN ACCOUNT
    @FindBy(css = "[id=\"email_create\"]")
    private WebElement fieldEmailCreate;

    @FindBy(css = "[class=\"icon-user left\"]")
    private WebElement buttonCreateAccount;
//ALREADY REGISTERED?
@FindBy(css = "[id=\"email\"]")
private WebElement fieldEmailAlreadyRegistered;

    @FindBy(css = "[id=\"passwd\"]")
    private WebElement fieldEPasswordAlreadyRegistered;


    @FindBy(css = "[class=\"icon-lock left\"]")
    private WebElement buttonSignIn;

    // Предупреждения об ошибках
    @FindBy(css = "[id=\"create_account_error\"]")
    private WebElement alertDanger;

    public AuthenticationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

        }


        public AccountCreationPage createAnAccountPositive(String newEmail){
        fieldEmailCreate.clear();
        fieldEmailCreate.sendKeys(newEmail);
        buttonCreateAccount.click();
        return new AccountCreationPage(driver);
        }

    public AuthenticationPage createAnAccountNegative(String text){
        fieldEmailCreate.clear();
        fieldEmailCreate.sendKeys(text);
        buttonCreateAccount.click();
        return this;
    }

    public MyAccountPage registerAnAccountPositive(String email, String password){
        fieldEmailAlreadyRegistered.sendKeys(email);
        fieldEPasswordAlreadyRegistered.sendKeys(password);
        buttonSignIn.click();
        return new MyAccountPage(driver);

    }

    public AuthenticationPage registerAnAccountNegative(String email, String password){
        fieldEmailAlreadyRegistered.sendKeys(email);
        fieldEPasswordAlreadyRegistered.sendKeys(password);
        buttonSignIn.click();
        return this;

    }

    public AuthenticationPage checkAlertDanger(String expectedText) throws InterruptedException {
        sleep(5000);
        String text = alertDanger.getText();
        System.out.println(text);
        Assert.assertEquals(text.toLowerCase().trim(),expectedText.toLowerCase().trim(),"не совпал ожидаемый текст и фактический ");
        return this;

    }



    @Override
    public AuthenticationPage openUrl() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        return this;
    }
}
