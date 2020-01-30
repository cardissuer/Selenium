package VyTrack;

import Utilities.VyTrackUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCalendarBtnTest {

    public static void main(String[] args) {
        WebDriver driver;

        String createCalendarEventLocatorCss = "a[title = 'Create Calendar event']";

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://qa2.vytrack.com/user/login");

        VyTrackUtils.login(driver, "storemanager85", "UserUser123");

        VyTrackUtils.navigateToModule(driver, "Activities", "Calendar Events");

        if (driver.findElement(By.cssSelector(createCalendarEventLocatorCss)).isDisplayed()) {
            System.out.println("Test 2 PASSED");
        } else {
            System.out.println("Test 2 FAILED");
        }
    }
}