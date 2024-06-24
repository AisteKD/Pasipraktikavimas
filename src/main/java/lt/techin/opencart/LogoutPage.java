package lt.techin.opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage{
    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    WebElement logoutTitle;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a")
    WebElement accountButton;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
    WebElement loginButton;

    public String getTitleLogout() {
        return logoutTitle.getText();
    }

    public void clickAccountButton(){
        accountButton.click();
    }

    public void clickLoginButton(){
        loginButton.click();
    }
}
