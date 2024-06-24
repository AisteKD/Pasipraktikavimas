package lt.techin.opencart.test;

import lt.techin.opencart.LoginPage;
import lt.techin.opencart.LogoutPage;
import lt.techin.opencart.RegisterPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogoutPageTest extends BasePageTest{

    @Test
    void clickAccountForLogin() {
        LogoutPage logoutPage = new LogoutPage(driver);
        driver.get("https://demo.opencart-extensions.co.uk/index.php?route=account/logout");
        logoutPage.clickAccountButton();
        palaukti();
        logoutPage.clickLoginButton();
        palaukti();

        LoginPage loginPage = new LoginPage(driver);
        String actualTitle = loginPage.getTitleLogin();
        String expectedTitle = "Returning Customer";
        Assertions.assertEquals(expectedTitle, actualTitle);
    }
}
