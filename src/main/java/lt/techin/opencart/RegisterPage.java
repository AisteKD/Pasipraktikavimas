package lt.techin.opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "input-firstname")
    WebElement inputFirstName;

    @FindBy(id = "input-lastname")
    WebElement inputLastName;

    @FindBy(id = "input-email")
    WebElement inputEmail;

    @FindBy(id = "input-telephone")
    WebElement inputTelephone;

    @FindBy(id = "input-address-1")
    WebElement inputAddress;

    @FindBy(id = "input-city")
    WebElement inputCity;

    @FindBy(id = "input-country")
    WebElement dropdownCountry;

    @FindBy(xpath = "//*[@id=\"input-country\"]/option[133]")
    WebElement inputCountryName;

    @FindBy(id = "input-zone")
    WebElement dropdownRegion;

    @FindBy(xpath = "//*[@id=\"input-zone\"]/option[11]")
    WebElement inputRegionName;

    @FindBy(id = "input-password")
    WebElement inputPassword;

    @FindBy(id = "input-confirm")
    WebElement inputConfirmPassword;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[1]")
    WebElement buttonConfirm;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[2]")
    WebElement buttonContinue;

    @FindBy(id = "input-postcode")
    WebElement inputPostCode;

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    WebElement registerAccountTitle;


    public void enterFirstName(String firstName) {
        inputFirstName.sendKeys(firstName);
    }

    public void enterLastName(String lastname) {
        inputLastName.sendKeys(lastname);
    }

    public void enterEmail(String email) {
        inputEmail.sendKeys(email);
    }

    public void enterTelephone(String telephone) {
        inputTelephone.sendKeys(telephone);
    }

    public void enterAddress(String address) {
        inputAddress.sendKeys(address);
    }

    public void enterCity(String city) {
        inputCity.sendKeys(city);
    }


    public void clickDropdownCountry() {
        dropdownCountry.click();
    }

    public void clickAndChooseDropdownCountry() {
        inputCountryName.click();
    }

    public void clickDropdownRegion() {
        dropdownRegion.click();
    }

    public void clickAndChooseDropdownRegion() {
        inputRegionName.click();
    }

    public void enterPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        inputConfirmPassword.sendKeys(confirmPassword);
    }

    public void clickButtonConfirm() {
        buttonConfirm.click();
    }

    public void clickButtonContinue() {
       buttonContinue.click();
    }

    public void enterPostCode(String postCode) {
        inputPostCode.sendKeys(postCode);
    }

    public String getTitleRegisterAccount() {
        return registerAccountTitle.getText();
    }
}
