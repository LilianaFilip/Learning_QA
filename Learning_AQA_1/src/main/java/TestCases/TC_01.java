package TestCases;

import TestSteps.RegisterSteps;
import Utils.DriverFactory;
import WebElements.Header;
import WebElements.LoginPage;

public class TC_01 extends DriverFactory {
    private DriverFactory driverFactory;
    private Header header;
    private LoginPage loginPage;
    private RegisterSteps registerSteps;

    public TC_01(DriverFactory driverFactory){
        this.driverFactory = driverFactory;
    }

    public void Scenario_01(){
        startBrowser("chrome", "https://www.catelulgras.ro/");
        registerSteps.clickRegisterButton();



//        closeBrowser();

    }
}
