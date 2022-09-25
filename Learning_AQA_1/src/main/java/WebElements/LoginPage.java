package WebElements;

import Utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends DriverFactory{

    private DriverFactory driverFactory;

    public LoginPage(DriverFactory driverFactory) {
        this.driverFactory = driverFactory;
    }

    WebElement emailField = getDriver().findElement(By.xpath("//input[@id='reg_email']"));
    WebElement passwordField = getDriver().findElement(By.xpath("//input[@id='reg_password']"));
    WebElement registerButton = getDriver().findElement(By.xpath("//button[@name='register']"));

}
