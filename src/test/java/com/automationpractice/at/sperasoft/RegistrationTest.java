package com.automationpractice.at.sperasoft;

import com.automationpractice.at.sperasoft.pages.AuthenticationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class RegistrationTest {

    protected WebDriver driver;

    @BeforeTest
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
    }

    @AfterTest
    void terDown() {
        driver.quit();
    }


    @Test(testName = "Регистрация нового пользователя")
    @Parameters({"firstName", "lastName", "password", "address", "city", "indexOfState", "postCode", "phone"})
    void testCreateAccountValidLoginParameters(
            String firstName,
            String lastName,
            String password,
            String address,
            String city,
            int indexOfState,
            String postCode,
            String phone) throws InterruptedException {
        new AuthenticationPage(driver)
                .openUrl().
                createAnAccountPositive((System.currentTimeMillis()) + "zvereva@ele.na").
                creationAccountPositive(
                        firstName, lastName, password, address, city, indexOfState, postCode, phone).
                checkMyAccountPageIsDisplayed().
                getHeaderBlock().
                checkNamePage("My account");
        sleep(5000);
    }

    @Test(testName = "Регистрация. «Email address» - не валидное значение")
    @Parameters({"emailInvalid", "expectedText"})
    void testCreateAccountInvalidLogin(String emailInvalid, String expectedText) throws InterruptedException {
        new AuthenticationPage(driver)
                .openUrl().
                createAnAccountNegative(emailInvalid).
                checkAlertDanger(expectedText);
        sleep(5000);
    }

}
