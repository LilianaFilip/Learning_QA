import TestCases.TC_01;
import Utils.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Main extends DriverFactory {

    private DriverFactory driverFactory;
    private TC_01 tc_01;

    public Main(DriverFactory driverFactory) {
        this.driverFactory = driverFactory;
        tc_01 = new TC_01(driverFactory);
    }

    @Test
    public void testRuner(){

        tc_01.Scenario_01();



    }

}
