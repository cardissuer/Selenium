package Cybertek14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLogicAuthentication {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        if (driver.getTitle().equalsIgnoreCase("Web Orders Login")) {
            System.out.println("Start page title verification passed");
        } else System.out.println("Start page title verification failed");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        if (driver.getTitle().equalsIgnoreCase("Web Orders")) {
            System.out.println("Landing page title verification passed");
        } else System.out.println("Landing page title verification failed");
    }
}