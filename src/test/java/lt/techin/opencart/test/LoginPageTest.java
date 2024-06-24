package lt.techin.opencart.test;

import lt.techin.opencart.AccountPage;
import lt.techin.opencart.LoginPage;
import lt.techin.opencart.LogoutPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginPageTest extends BasePageTest{

    @Test
    void fillCorrectEmailAndPasswordForLoginAndLogout() {
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://demo.opencart-extensions.co.uk/index.php?route=account/login");
        loginPage.enterEmailAddress("aistii@gmail.com");
        palaukti();
        loginPage.enterPassword("aistiii1");
        palaukti();
        loginPage.clickButtonLogin();
        palaukti();


        driver.get("https://demo.opencart-extensions.co.uk/index.php?route=account/account");
        String actualTitle = loginPage.getTitleLogin();
        String expectedTitle = "My Account";
        Assertions.assertEquals(expectedTitle, actualTitle);

        loginPage.clickButtonAccountForLogout();
        palaukti();
        loginPage.clickButtonLogout();
        palaukti();

        LogoutPage logoutPage = new LogoutPage(driver);
        String actualTitleLogout = logoutPage.getTitleLogout();
        String expectedTitleLogout = "Account Logout";
        Assertions.assertEquals(expectedTitleLogout, actualTitleLogout);
    }

    @Test
    void fillIncorrectEmailAndPasswordForLoginAndLogout() {
        LogoutPage logoutPage = new LogoutPage(driver);
        driver.get("https://demo.opencart-extensions.co.uk/index.php?route=account/logout");
        logoutPage.clickAccountButton();
        palaukti();
        logoutPage.clickLoginButton();
        palaukti();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmailAddress("manopastas@gmail.com");
        palaukti();
        loginPage.enterPassword("mano_pastas");
        palaukti();
        loginPage.clickButtonLogin();
        palaukti();

        String errorMessage = loginPage.getErrorMessage();
        String expectedMessage = "Warning: No match for E-Mail Address and/or Password.";
        assertEquals(expectedMessage, errorMessage);
    }
}
