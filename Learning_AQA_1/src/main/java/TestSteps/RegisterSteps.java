package TestSteps;

import Utils.DriverFactory;
import WebElements.Header;
import WebElements.LoginPage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterSteps extends DriverFactory {

    private DriverFactory driverFactory;
    private WebDriverWait wait;
    private Header header;
    private LoginPage loginPage;

    public RegisterSteps(DriverFactory driverFactory) {
        this.driverFactory = driverFactory;
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
    }

    public void clickRegisterButton(){
        wait.until(ExpectedConditions.elementToBeClickable(header.loginButton));
        header.loginButton.click();
    }
}
