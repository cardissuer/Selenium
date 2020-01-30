package VyTrack;

import Utilities.SeleniumUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogCallTest {

    public static void main(String[] args) {

        String userNameLocatorID = "prependedInput";
        String passwordLocatorID = "prependedInput2";
        String tabLocatorXpath = "//span[contains(text(),'Activities') and @class='title title-level-1']";
        String moduleLocatorXpath = "//span[.='Calls']";
        String logCallBtnLocator = "a[title='Log call']";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://qa2.vytrack.com/user/login");

        driver.findElement(By.id(userNameLocatorID)).sendKeys("storemanager85");
        driver.findElement(By.id(passwordLocatorID)).sendKeys("UserUser123"+ Keys.ENTER);

        SeleniumUtils.pause(5);
        driver.findElement(By.xpath(tabLocatorXpath)).click();

        SeleniumUtils.pause(2);
        driver.findElement(By.xpath(moduleLocatorXpath)).click();

        SeleniumUtils.pause(2);
        if (driver.findElement(By.cssSelector(logCallBtnLocator)).isDisplayed()){
            System.out.println("Test 1 PASSED");
        } else {
            System.out.println("Test 1 FAILED");
        }
    }
}