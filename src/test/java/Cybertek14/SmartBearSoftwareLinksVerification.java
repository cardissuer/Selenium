package Cybertek14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearSoftwareLinksVerification {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
        //driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
        //driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();

        LoginToSmartBear(driver);
        List<WebElement> links = driver.findElements(By.xpath("//body//a"));
        System.out.println("Number of all links on the page: " + links.size());

        System.out.println("LINKS ORDER:");
        for (WebElement link : links) {
            System.out.println(link.getText());
        }

        verifyOrder(driver, "Paul Brown");
    }

    public static void LoginToSmartBear(WebDriver driver) {

        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();
    }

    public static void verifyOrder(WebDriver driver, String givenName) {
        List <WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        for (WebElement name: allNames){
            if (name.getText().equals(givenName)){
                System.out.println("Given name exist in list, verification passed");
                return;
            }
        }
        System.out.println("Given name doesn't exist in list, verification failed");
    }

    public static void printNamesAndCities (WebDriver driver){
        List <WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        List <WebElement> allCities = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[7]"));
        for (int i=0;i<allNames.size();i++){
            System.out.println(allNames.get(i).getText() + " <-- name, city --> " + allCities.get(i).getText());
        }
    }
}