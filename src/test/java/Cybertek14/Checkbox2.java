package Cybertek14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Checkbox2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement message = driver.findElement(By.xpath("//div [@class='panel-body']/div[2]"));
        if (message.isDisplayed()) {
            System.out.println("Success is displayed");
        } else System.out.println("Success message is NOT displayed");

        WebElement checkbox = driver.findElement(By.xpath("//div [@class='panel-body']/div[1]"));
        checkbox.click();

        if (message.isDisplayed()) {
            System.out.println("Success is displayed");
        } else System.out.println("Success message is NOT displayed");

    }

    ////TC    #2: SeleniumEasy    CheckboxVerification–Section  1
    //        // 1.Open   Chrome  browser
    //        // 2.Go to  https://www.seleniumeasy.com/test/basic-checkbox-demo.html
    //        WebDriverManager.chromedriver().setup();
    //        WebDriver driver = new ChromeDriver();
    //        driver.manage().window().maximize();
    //        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    //        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    //        // 3.Verify “Success  –Check    box is  checked”  message is NOT displayed.
    //        WebElement successMessage = driver.findElement(By.xpath("//div[@id='txtAge']"));
    //        if(!successMessage.isDisplayed()){
    //            System.out.println("Success message is not displayed by default. Verification PASSED!");
    //        }else{
    //            System.out.println("Success message is displayed by default. Verification FAILED!!!");
    //        }
    //        // 4.Click  to  checkbox    under   “Single   Checkbox    Demo” section
    //        WebElement checkbox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
    //        checkbox.click();
    //        // 5.Verify “Success  –Check    box is  checked”  message isdisplayed
    //        if(successMessage.isDisplayed()){
    //            System.out.println("Success message is  displayed. Verification PASSED!");
    //        }else{
    //            System.out.println("Success message is NOT displayed. Verification FAILED!!!");
}