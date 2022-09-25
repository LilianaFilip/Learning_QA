package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void startBrowser(String browser, String targetAddress){
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                setDriver(new ChromeDriver());
                getDriver().get(targetAddress);
                break;
        }
    }

    public void closeBrowser(){
        getDriver().quit();
    }
}
