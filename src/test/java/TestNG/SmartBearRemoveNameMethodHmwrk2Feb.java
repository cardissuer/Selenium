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

public class SmartBearRemoveNameMethodHmwrk2Feb {

    WebDriver driver;
    @BeforeMethod
    public void deleteFromTheList (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearSoftwareLinksVerification.LoginToSmartBear(driver);
    }

//    @Test
//    public void callMethod (){
//        String givenName = "Mark Smith";
// //       removeAnyName(driver,givenName);
//        Assert.assertTrue((driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[2]")).getText().contains(givenName)),"Name wasn't deleted well");
//    }
//
//    public void removeAnyName () {
//            List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[2]"));
//            for (int i=1;i<9;i++){
//
//                Assert.assertFalse(allNames.get(i).getText().equals("Mark Smith"),"name removed//////////////////");
////                if (driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr[i]/td[2]")).getText().equals(givenName)){
////                    driver.findElement(By.xpath("//div/table[@class='SampleTable']/tbody/tr[i]/td[13]")).click();
////                    return;
//                }
//        }

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearSoftwareLinksVerification.LoginToSmartBear(driver);
    }
    @Test
    public void deleteOrderTest(){
        WebElement markSmithCheckBox = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[.='Mark Smith']/../td[1]"));
        markSmithCheckBox.click();
        WebElement deleteButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deleteButton.click();
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        for(WebElement name : allNames) {
            System.out.println(name.getText());
            Assert.assertFalse(name.getText().equals("Mark Smith"), "The name is in the list. Test FAILED!!!");
        }
    }
    @Test
    public void editOrderTest(){
        String xpathForSteveEditButton = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[.='Steve Johns']/../td[13]";
        WebElement editButtonSteveJohns = driver.findElement(By.xpath(xpathForSteveEditButton));
        editButtonSteveJohns.click();
        WebElement customerNameInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        customerNameInput.clear();
        customerNameInput.sendKeys("Michael Jordan");
        WebElement updateButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton"));
        updateButton.click();
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        for(WebElement name : allNames) {
            System.out.println(name.getText());
            if(name.getText().equals("Michael Jordan")) {
                Assert.assertTrue(name.getText().equals("Michael Jordan"), "The name is NOT in the list. Test FAILED!!!");
            }
        }
    }
    @Test
    public void deleteNameTest2(){
        deleteName(driver, "Bob Feather");
    }
    public static void deleteName(WebDriver driver, String nameToBeDeleted) {
        String word = "example";
        String sentence = "This is " + word + "my sentence";
        String xpathForCheckboxes = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[.='" + nameToBeDeleted + "']/../td[1]";
        WebElement dynamicCheckBox = driver.findElement(By.xpath(xpathForCheckboxes));
        dynamicCheckBox.click();
        WebElement deleteButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deleteButton.click();
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        for (WebElement name : allNames) {
            System.out.println(name.getText());
            Assert.assertFalse(name.getText().equals(nameToBeDeleted), "The name is in the list. Test FAILED!!!");
        }
    }
}