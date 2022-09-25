package WebElements;

import Utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Header extends DriverFactory {

    private DriverFactory driverFactory;

    public Header(DriverFactory driverFactory) {
        this.driverFactory = driverFactory;
    }
    public WebElement loginButton = getDriver().findElement(By.xpath("//span[contains(text(),'Autentificare / Înregistrare ')]/.."));
}
