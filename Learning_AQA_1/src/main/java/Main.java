import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Main {
    private WebDriver driver;

    public void chromeInit(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testMethod(){
        chromeInit();
        driver.get("https://www.catelulgras.ro/");
        WebElement loginButton = driver.findElement(By.xpath("//span[contains(text(),'Autentificare / Înregistrare ')]/.."));
        loginButton.click();
    }
}
