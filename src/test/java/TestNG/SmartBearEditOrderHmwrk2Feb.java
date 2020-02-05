package TestNG;

import Cybertek14.SmartBearSoftwareLinksVerification;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmartBearEditOrderHmwrk2Feb {
    WebDriver driver;
    @BeforeMethod
    public void deleteFromTheList (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @Test
    public void editPosition     (){
        SmartBearSoftwareLinksVerification.LoginToSmartBear(driver);
        driver.findElement(By.xpath("//div/table[@class='SampleTable']/tbody/tr[4]/td[13]")).click();
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']")).clear();
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']")).sendKeys("Michael Jordan");
        driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_UpdateButton']")).click();
        String table = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[4]/td[2]")).getText();
        Assert.assertEquals(table, "Michael Jordan", "Name wasn't changed successfully");
    }
}