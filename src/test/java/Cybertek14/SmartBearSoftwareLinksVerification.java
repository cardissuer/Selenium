package Cybertek14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    }
        public static void LoginToSmartBear (WebDriver driver){

            driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
            driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
            driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();
        }
    }