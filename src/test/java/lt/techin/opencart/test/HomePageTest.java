package lt.techin.opencart.test;

import lt.techin.opencart.BasePage;
import lt.techin.opencart.HomePage;
import lt.techin.opencart.RegisterPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class HomePageTest extends BasePageTest {

    @Test
    void clickAccountAndRegisterButtons(){
        HomePage homePage = new HomePage(driver);
        driver.get("https://demo.opencart-extensions.co.uk/");
        homePage.clickAccountButton();
        palaukti();
        homePage.clickRegisterButton();
        palaukti();

        RegisterPage registerPage = new RegisterPage(driver);
        String actualTitle = registerPage.getTitleRegisterAccount();
        String expectedTitle = "Register Account";
        Assertions.assertEquals(expectedTitle, actualTitle);
    }
}
