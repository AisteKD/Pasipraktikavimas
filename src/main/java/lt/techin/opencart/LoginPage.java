package lt.techin.opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/h2[1]")
    WebElement loginTitle;

    @FindBy(id = "input-email")
    WebElement inputEmailAddress;

    @FindBy(id = "input-password")
    WebElement inputPassword;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
    WebElement buttonLogin;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
    WebElement buttonAccountForLogout;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
    WebElement buttonLogout;

    @FindBy(xpath = "/html/body/div[2]/div[1]")
    WebElement errorMessage;


    public String getTitleLogin() {
        return loginTitle.getText();
    }

    public void enterEmailAddress(String emailAddress) {
        inputEmailAddress.sendKeys(emailAddress);
    }

    public void enterPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void clickButtonLogin() {
        buttonLogin.click();
    }

    public void clickButtonAccountForLogout() {
        buttonAccountForLogout.click();
    }

    public void clickButtonLogout() {
       buttonLogout.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }
}
