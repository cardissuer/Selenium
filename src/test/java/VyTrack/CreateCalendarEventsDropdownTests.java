package VyTrack;

import Utilities.SeleniumUtils;
import Utilities.VyTrackUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCalendarEventsDropdownTests {

    public static void main(String[] args) {

        /*WebDriver driver;

        String createCalendarEventLocatorCss = "a[title = 'Create Calendar Event']";
        String saveAndCloseBtnLocatorXpath = "//div/button [contains(text(), 'Save and Close')]";
        String dropdownBtnLocatorXpath = "//a[@class ='btn-success btn dropdown-toggle']";
        String saveAndCloseOptionLocatorXpath = "//li[button(contains (text(), 'Save and Close')]";
        String saveAndNewOptionLocatorXpath = "//li[button(contains (text(), 'Save and New')]";
        String saveOptionLocatorXpath = "(//li[button(contains (text(), 'Save')])[3]";

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://qa2.vytrack.com/user/login");

        VyTrackUtils.login(driver, "storemanager85", "UserUser123");
        VyTrackUtils.navigateToModule(driver, "Activities", "Calendar Events");

        driver.findElement(By.cssSelector(createCalendarEventLocatorCss)).click();

        SeleniumUtils.pause(3);

        if (driver.findElement(By.xpath(saveAndCloseBtnLocatorXpath)).isDisplayed()) {
            System.out.println("Save and Close button PASSED");
        }
            System.out.println("Save and Close button FAILED");

        driver.findElement(By.xpath(dropdownBtnLocatorXpath)).click();
        SeleniumUtils.pause(1);

        if (driver.findElement(By.xpath(saveAndCloseOptionLocatorXpath)).isDisplayed()) {
            System.out.println("Save and Close option PASSED");
        }
        System.out.println("Save and Close option FAILED");
    }*/

        WebDriver driver;
        String createCalendarBtnLocatorCss = "a[title = 'Create Calendar event']";
        String saveAndCloseBtnLocatorXpath = "//div/button[contains(text(), 'Save and Close')]";
        String dropDownBtnLocatorXpath = "//a[@class = 'btn-success btn dropdown-toggle']";
        //                                  //a/span[@class = 'caret']
        String saveAndCloseOptionLocatorXpath = "//li/button[contains(text(), 'Save and Close')]";
        String saveAndNewOptionLocatorXpath = "//li/button[contains(text(), 'Save and New')]";
        String saveOptionLocatorXpath = "(//li/button[contains(text(), 'Save')])[3]";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");
        // Step 1
        VyTrackUtils.login(driver, "storemanager85", "UserUser123");
        // Step 2 and 3
        VyTrackUtils.navigateToModule(driver, "Activities", "Calendar Events");
        // Step 4
        driver.findElement(By.cssSelector(createCalendarBtnLocatorCss)).click();
        SeleniumUtils.pause(3);
        // Step 5
        if (driver.findElement(By.xpath(saveAndCloseBtnLocatorXpath)).isDisplayed()) {
            System.out.println("Save and Close btn - Pass");
        } else {
            System.out.println("Save and Close btn - Fail");
        }
        // Step 6

        driver.findElement(By.xpath(dropDownBtnLocatorXpath)).click();
        SeleniumUtils.pause(1);
        if (driver.findElement(By.xpath(saveAndCloseOptionLocatorXpath)).isDisplayed()) {
            System.out.println("Save and Close option - Pass");
        } else {
            System.out.println("Save and Close option - Fail");
        }

        // Step-verify all options
        if (driver.findElement(By.xpath(saveAndNewOptionLocatorXpath)).isDisplayed()) {
            System.out.println("Save and New option - Pass");
        } else {
            System.out.println("Save and New option - Fail");
        }
        if (driver.findElement(By.xpath(saveOptionLocatorXpath)).isDisplayed()) {
            System.out.println("Save option - Pass");
        } else {
            System.out.println("Save option - Fail");
        }
    }
}