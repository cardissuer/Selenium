package Cybertek14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SmartBearVerifyOrder {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearSoftwareLinksVerification.LoginToSmartBear(driver);
        //verify the givenName is in the list
        SmartBearSoftwareLinksVerification.verifyOrder(driver,"Paul Brown");
        SmartBearSoftwareLinksVerification.printNamesAndCities(driver);
    }
}



