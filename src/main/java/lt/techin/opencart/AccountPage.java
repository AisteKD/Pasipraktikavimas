package lt.techin.opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    WebElement registerSuccessfullyAccountTitle;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
    WebElement accountButton;

    @FindBy(css = "#top-links > ul > li.dropdown.open > ul > li:nth-child(5) > a")
    WebElement logoutButton;

    @FindBy(xpath = "//*[@id=\"content\"]/h2[1]")
    WebElement loginSuccessfullyAccountTitle;

    public String getTitleSuccessfullyRegisterAccount() {
        return registerSuccessfullyAccountTitle.getText();
    }

    public void clickAccountButton(){
        accountButton.click();
    }

    public void clickMyAccountLogoutButton(){
        logoutButton.click();
    }

    public String getTitleSuccessfullyLoginAccount() {
        return loginSuccessfullyAccountTitle.getText();
    }
}
