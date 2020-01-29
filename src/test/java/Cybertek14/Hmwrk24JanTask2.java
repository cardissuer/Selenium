package Cybertek14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.NoSuchElementException;

public class Hmwrk24JanTask2 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        // TC #2: PracticeCybertek.com_AddRemoveElementsWebElement verification
        // 1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get ("http://practice.cybertekschool.com/add_remove_elements/");
        // 3.Click to “Add Element”button
        driver.findElement(By.xpath("//button [contains (@onclick, 'addElement()')]")).click();
        // 4.Verify “Delete”button is displayed after clicking.
        if (driver.findElement(By.xpath("//button [contains (@onclick, 'deleteElement()')]")).isDisplayed()) {
            System.out.println("Delete button is displayed");
        } //else System.out.println("Delete button is NOT displayed");
        // 5.Click to “Delete”button.
        driver.findElement(By.xpath("//button [contains (@onclick, 'deleteElement()')]")).click();
        // 6.Verify “Delete”button is NOT displayed after clicking.
        try {
            driver.findElement(By.xpath("//button [contains (@onclick, 'deleteElement()')]"));
        } catch (Exception e) {
            System.out.println("Delete button is NOT displayed");
        }
        // USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }

    //        TC #2: PracticeCybertek.com_AddRemoveElementsWebElement verification
    //        // 1.Open Chrome browser
    //        // 2.Go to http://practice.cybertekschool.com/add_remove_elements
    //        WebDriverManager.chromedriver().setup();
    //        WebDriver driver = new ChromeDriver();
    //        driver.manage().window().maximize();
    //        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
    //        // 3.Click to “Add Element” button
    //        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));
    //        Thread.sleep(2000);
    //        addElementButton.click();
    //        // 4.Verify “Delete” button is displayed after clicking.
    //        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
    //        if(deleteButton.isDisplayed()){
    //            System.out.println("Delete button is displayed. Verification PASSED!");
    //        }else{
    //            System.out.println("Delete button is not displayed! Verification FAILED!!!");
    //        }
    //        Thread.sleep(2000);
    //        // 5.Click to “Delete” button.
    //        deleteButton.click();
    //        // 6.Verify “Delete” button is NOT displayed after clicking.
    //        try {
    //            WebElement deleteButtonReferenceAfterClick = driver.findElement(By.xpath("//button[.='Delete']"));
    //            if (deleteButtonReferenceAfterClick.isDisplayed()) {
    //                System.out.println("Delete button is displayed. Verification FAILED!!!");
    //            } else {
    //                System.out.println("Delete button is NOT displayed. Verification PASSED!!!");
    //            }
    //        }catch (NoSuchElementException a){
    //            System.out.println("Delete button is not displayed. Verification PASSED!");

    }