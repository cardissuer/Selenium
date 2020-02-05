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

import java.util.concurrent.TimeUnit;

public class SmartBearDeleteOrderHmwrk2Feb {
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
        public void deleteOnePosition (){
        SmartBearSoftwareLinksVerification.LoginToSmartBear(driver);
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_orderGrid_ctl03_OrderSelector']")).click();
            //driver.findElement(By.xpath("//table[@id=‘ctl00_MainContent_orderGrid’]/tbody/tr/td[.=‘Mark Smith’]/preceding-sibling::td\n" +
                    //"\n"));
            driver.findElement(By.xpath("//input[@id='ctl00_MainContent_btnDelete']")).click();
        //String table = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[3]/td[2]")).getText();
            String table = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']")).getText();
            Assert.assertEquals(table, "Mark Smith", "text is deleted");
    }

    //@Test
    //    public void deleteOrderTest(){
    //        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    //        SmartBearSoftwareLinksVerification.loginToSmartBear(driver);
    //        WebElement markSmithCheckBox = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[.='Mark Smith']/../td[1]"));
    //        markSmithCheckBox.click();
    //        WebElement deleteButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
    //        deleteButton.click();
    //        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
    //        for(WebElement name : allNames) {
    //            System.out.println(name.getText());
    //            Assert.assertFalse(name.getText().equals("Mark Smith"), "The name is in the list. Test FAILED!!!");
}