package lt.techin.opencart.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePageTest {

    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    void tearDown() {
        if(driver!=null){
        driver.close();}
    }

    public void palaukti() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }
}
