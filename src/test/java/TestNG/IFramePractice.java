package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IFramePractice {

    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void setup() {

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");
    }
        @Test
        public void iFrameTest () {
        driver.switchTo().frame(0);
        WebElement iframe = driver.findElement(By.xpath("//p"));
        Assert.assertFalse(iframe.getText().equals("Your content goes here."), "Verification PASSED");

        driver.switchTo().parentFrame();
        WebElement header = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(header.isDisplayed(), "Verification of main frame FAILED");
        }
    }