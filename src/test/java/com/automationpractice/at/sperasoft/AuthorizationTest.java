package com.automationpractice.at.sperasoft;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import com.automationpractice.at.sperasoft.base.BeforeAndAfter;
import com.automationpractice.at.sperasoft.pages.AuthenticationPage;
import java.util.concurrent.TimeUnit;


import static java.lang.Thread.sleep;

public class AuthorizationTest extends BeforeAndAfter {

    protected WebDriver driver;

    @BeforeTest

    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
    }
    @AfterTest
    void terDown(){driver.quit();}


        @Test(suiteName = "Регистрация")
        @Parameters({"firstName", "lastName", "password", "address", "city","indexOfState","postCode","phone"})
        void checkSingInValidLoginParameters(
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
                    createAnAccountPositive((System.currentTimeMillis())+"zvereva@ele.na").
                    creationAccountPositive(
                            firstName,lastName,password,address,city,indexOfState,postCode,phone).
                    checkMyAccountPageIsDisplayed();
            sleep(5000);
        }

}
