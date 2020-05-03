package com.automationpractice.at.sperasoft.pages;
import com.automationpractice.at.sperasoft.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class AccountCreationPage extends BasePage{

    //++++++++++++++++++++++++++++++++++++++YOUR PERSONAL INFORMATION

    @FindBy(css = "[id=\"id_gender1\"]")
    protected WebElement radioButtonMr;

    @FindBy(css = "[id=\"id_gender2\"]")
    protected WebElement radioButtonMrs;

    @FindBy(css = "[id=\"customer_firstname\"]")
    private WebElement fieldFirstNameCustomer;

    @FindBy(css = "[id=\"customer_lastname\"]")
    private WebElement fieldLastNameCustomer;

    @FindBy(css = "[id=\"email\"]")
    private WebElement fieldEmail;

    @FindBy(css = "[id=\"passwd\"]")
    private WebElement fieldPassword;
    //+++++++++++++++++++++++++++++++++++++++++++Date of Birth
    @FindBy(css = "[id=\"days\"]")
    private WebElement fieldDayOfBirth;

    @FindBy(css = "[id=\"months\"]")
    private WebElement fieldMonthsOfBirth;

    @FindBy(css = "[id=\"years\"]")
    private WebElement fieldYearsOfBirth;

    @FindBy(css = "[id=\"newsletter\"]")
    private WebElement checkboxNewsletter;

    @FindBy(css = "[id=\"optin\"]")
    private WebElement checkboxSpecialOffers;
    //+++++++++++++++++++++++++++++++++++++++++++++YOUR ADDRESS
    @FindBy(css = "[id=\"firstname\"]")
    private WebElement fieldFirstName;

    @FindBy(css = "[id=\"lastname\"]")
    private WebElement fieldLastName;

    @FindBy(css = "[id=\"company\"]")
    private WebElement fieldCompany;

    @FindBy(css = "[id=\"address1\"]")
    private WebElement fieldAddress1;

    @FindBy(css = "[id=\"address2\"]")
    private WebElement fieldAddress2;

    @FindBy(css = "[id=\"city\"]")
    private WebElement fieldCity;

    @FindBy(css = "[id=\"id_state\"]")//--------ВЫПАДАЮЩИЙ СПИСОК
    private WebElement fieldState;

    @FindBy(css = "[id=\"id_state\"] > option")//+++++++++++ВЫПАДАЮЩИЙ СПИСОК
    private List<WebElement> fieldStateApt;

    //#id_state > option

    @FindBy(css = "[id=\"postcode\"]")
    private WebElement fieldPostalCode;

    @FindBy(css = "[id=\"id_country\"]")//--------ВЫПАДАЮЩИЙ СПИСОК
    private WebElement fieldCountry;

    @FindBy(css = "[id=\"id_country\"]> option:nth-child(2)")//++++++++++-ВЫПАДАЮЩИЙ СПИСОК
    private WebElement countryUSA;

    //#id_country > option:nth-child(2)

    @FindBy(css = "[id=\"other\"]")
    private WebElement fieldAdditionalInformation;

    @FindBy(css = "[id=\"phone\"]")
    private WebElement fieldHomePhone;

    @FindBy(css = "[id=\"phone_mobile\"]")
    private WebElement fieldMobilePhone;

    @FindBy(css = "[id=\"alias\"]")
    private WebElement fieldAddressAlias;

    @FindBy(css = "[id=\"submitAccount\"]")
    private WebElement buttonRegister;


    public AccountCreationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

  public AccountCreationPage creationAccountNegativeTry(
          String firstName,
          String lastName,
          String password,
          String address,
          String city,
          int indexOfState,
          String postCode,
          String phone){
        radioButtonMr.click();
        fieldFirstNameCustomer.sendKeys(firstName);
        fieldLastNameCustomer.sendKeys(lastName);
        fieldPassword.sendKeys(password);
        fieldAddress1.sendKeys(address);
        fieldCity.sendKeys(city);
        fieldState.click();
        fieldStateApt.get(indexOfState).click();
        fieldCountry.click();
        countryUSA.click();
        fieldPostalCode.sendKeys(postCode);
        fieldHomePhone.sendKeys(phone);
      buttonRegister.click();
        return this;
        }

    public MyAccountPage creationAccountPositive(
            String firstName,
            String lastName,
            String password,
            String address,
            String city,
            int indexOfState,
            String postCode,
            String phone){
        radioButtonMr.click();
        fieldFirstNameCustomer.sendKeys(firstName);
        fieldLastNameCustomer.sendKeys(lastName);
        fieldPassword.sendKeys(password);
        fieldAddress1.sendKeys(address);
        fieldCity.sendKeys(city);
        fieldState.click();
        fieldStateApt.get(indexOfState).click();
        fieldCountry.click();
        countryUSA.click();
        fieldPostalCode.sendKeys(postCode);
        fieldHomePhone.sendKeys(phone);
        buttonRegister.click();

        return new MyAccountPage(driver);}


        public AccountCreationPage checkPageAfterNegativeTry(){

        return this;
        }
}
