package lt.techin.opencart.test;

import lt.techin.opencart.AccountPage;
import lt.techin.opencart.HomePage;
import lt.techin.opencart.LogoutPage;
import lt.techin.opencart.RegisterPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.AbstractCollection;

public class RegisterPageTest extends BasePageTest {

    @Test
    void fillRegisterForm() {
        RegisterPage registerPage = new RegisterPage(driver);
        driver.get("https://demo.opencart-extensions.co.uk/index.php?route=account/register");
        registerPage.enterFirstName("Aistii");
        palaukti();
        registerPage.enterLastName("Aistii");
        palaukti();
        registerPage.enterEmail("aistii@gmail.com");
        palaukti();
        registerPage.enterTelephone("+37066023005");
        palaukti();
        registerPage.enterAddress("Vilnoniu 2");
        palaukti();
        registerPage.enterCity("Vilnius");
        palaukti();
        registerPage.enterPostCode("06299");
        palaukti();
        registerPage.clickDropdownCountry();
        palaukti();
        registerPage.clickAndChooseDropdownCountry();
        palaukti();
        registerPage.clickDropdownRegion();
        palaukti();
        registerPage.clickAndChooseDropdownRegion();
        palaukti();
        registerPage.enterPassword("aistiii1");
        palaukti();
        registerPage.enterConfirmPassword("aistiii1");
        palaukti();
        registerPage.clickButtonConfirm();
        palaukti();
        registerPage.clickButtonContinue();
        palaukti();

        AccountPage accountPage = new AccountPage(driver);
        driver.get("https://demo.opencart-extensions.co.uk/index.php?route=account/success");
        String actualTitle = accountPage.getTitleSuccessfullyRegisterAccount();
        String expectedTitle = "Your Account Has Been Created!";
        Assertions.assertEquals(expectedTitle, actualTitle);
        System.out.println();

//        driver.get("https://demo.opencart-extensions.co.uk/index.php?route=account/success");
        accountPage.clickAccountButton();
        palaukti();
        accountPage.clickMyAccountLogoutButton();
        palaukti();

        LogoutPage logoutPage = new LogoutPage(driver);
        String actualTitleLogout = logoutPage.getTitleLogout();
        String expectedTitleLogout = "Account Logout";
        Assertions.assertEquals(expectedTitleLogout, actualTitleLogout);
    }
}

