package Cybertek14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Checkbox3 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://seleniumeasy.com/test/basic-checkbox-demo.html");

        //WebElement text = driver.findElement(By.xpath("//input[@value='Check All']"));
        WebElement button = driver.findElement(By.xpath("//input[@id='check1']"));
        WebElement css = (driver.findElement(By.cssSelector("input#check1.btn.btn-primary")));

        //if (css.getText().equals ("Check All")) {
        if (button.getAttribute("value").equals("Check All")){
        //  if (button.getText().equals("Check All")) {
            System.out.println("Text Check All verification is passed OK");
        } else System.out.println ("Text Check All verification is NOT passed");

        button.click();

        if (driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected()){
            System.out.println("Checkbox 1 is selected");
        } else System.out.println("Checkbox 1 is NOT selected");

        if (driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).isSelected()){
            System.out.println("Checkbox 2 is selected");
        } else System.out.println("Checkbox 2 is NOT selected");

        if (driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).isSelected()){
            System.out.println("Checkbox 3 is selected");
        } else System.out.println("Checkbox 3 is NOT selected");

        if (driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).isSelected()){
            System.out.println("Checkbox 4 is selected");
        } else System.out.println("Checkbox 4 is NOT selected");

        /*if (driver.findElement(By.xpath("//input[@type='button']/../div[1]/label/input[@class='cb1-element']")).isSelected()){
            System.out.println("Checkbox 1 is selected");
        } else System.out.println("Checkbox 1 is NOT selected");

        if (driver.findElement(By.xpath("//input[@type='button']/../div[2]/label/input[@class='cb1-element']")).isSelected()){
            System.out.println("Checkbox 2 is selected");
        } else System.out.println("Checkbox 2 is NOT selected");

        if (driver.findElement(By.xpath("//input[@type='button']/../div[3]/label/input[@class='cb1-element']")).isSelected()){
            System.out.println("Checkbox 3 is selected");
        } else System.out.println("Checkbox 3 is NOT selected");

        if (driver.findElement(By.xpath("//input[@type='button']/../div[4]/label/input[@class='cb1-element']")).isSelected()){
            System.out.println("Checkbox 4 is selected");
        } else System.out.println("Checkbox 4 is NOT selected");*/

        if (button.getAttribute("value").equals ("Uncheck All")){
            System.out.println("Text Uncheck All verification is passed OK");
        } else System.out.println("Text Uncheck All verification is NOT passed");

        }
       // Gurhan's solution
        // public static void main(String[] args) {
    //        //TC    #3: SeleniumEasy    Checkbox    Verification    –Section  2
    //        // 1.Open   Chrome  browser
    //        WebDriverManager.chromedriver().setup();
    //        WebDriver driver = new ChromeDriver();
    //        driver.manage().window().maximize();
    //        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //        // 2.Go to  https://www.seleniumeasy.com/test/basic-checkbox-demo.html
    //        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    //        // 3.Verify “Check    All”  button  text    is  “Check    All”
    //        WebElement checkAllButton = driver.findElement(By.xpath("//input[@id='check1']"));
    //        String expectedText = "Check All";
    //        String actualText = checkAllButton.getAttribute("value");
    //        if(actualText.equals(expectedText)){
    //            System.out.println("Check All button text verification PASSED!");
    //        }else{
    //            System.out.println("Check All button text verification FAILED!!!");
    //        }
    //        // 4.Click  to  “Check    All”  button
    //        checkAllButton.click();
    //        // 5.Verify all check   boxes   are checked
    //        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[1]"));
    //        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]"));
    //        WebElement checkbox3 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[3]"));
    //        WebElement checkbox4 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[4]"));
    //        if(checkbox1.isSelected() && checkbox2.isSelected() && checkbox3.isSelected() && checkbox4.isSelected()){
    //            System.out.println("All checkboxes are checked. Verification PASSED!");
    //        }else{
    //            System.out.println("All checkboxes are not checked. Verification FAILED!!!");
    //        }
    //        // 6.Verify button  text    changed to  “Uncheck All"
    //        String expectedValueAfterClick = "Uncheck All";
    //        String actualValueAfterClick = checkAllButton.getAttribute("value");
    //        if(expectedValueAfterClick.equals(actualValueAfterClick)){
    //            System.out.println("Button text changed to Uncheck All. Verification PASSED!");
    //        }else{
    //            System.out.println("Button text verification FAILED!!!");
    //        }
    //    }
    //}
}