package TestNG;

import Cybertek14.SmartBearSoftwareLinksVerification;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearDeleteAll {

    /*WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @Test
    public void deleteAllTest() {
        SmartBearSoftwareLinksVerification.LoginToSmartBear(driver);
        driver.findElement(By.xpath("//a[@id='ctl00_MainContent_btnCheckAll']")).click();
        List<WebElement> allCheckboxes = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[1]"));
        for (WebElement Checkbox : allCheckboxes) {
            Assert.assertTrue(Checkbox.isSelected());
        }
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_btnDelete']")).click();
        WebElement deleteButton = driver.findElement(By.xpath("//div[@id='ctl00_MainContent_orderMessage']"));
        Assert.assertTrue(deleteButton.isDisplayed(),"Message is not displayed");
    }*/

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @Test
    public void deleteAllTest() throws  InterruptedException{
        SmartBearSoftwareLinksVerification.LoginToSmartBear(driver);
        WebElement checkAll = driver.findElement(By.id("ctl00_MainContent_btnCheckAll"));
        checkAll.click();
        List<WebElement> checkboxes = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[1]"));
        for(WebElement checkbox : checkboxes){
            Thread.sleep(1000);
            Assert.assertTrue(checkbox.isSelected());
            //assertTrue accepts boolean condition
        }
        WebElement deleteSelectedButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deleteSelectedButton.click();
        WebElement emptyOrderListMessage = driver.findElement(By.id("ctl00_MainContent_orderMessage"));
        Assert.assertTrue(emptyOrderListMessage.isDisplayed(), "Empty order list message is NOT displayed.");
    }
}