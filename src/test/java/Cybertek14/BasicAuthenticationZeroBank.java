package Cybertek14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticationZeroBank {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password");
        driver.findElement(By.name("submit")).click();
        if (driver.findElement(By.linkText("username")).isDisplayed()) {
            System.out.println("Username verification passed");
        } else System.out.println("Username verification failed");
        //if (driver.getTitle().contains("Zero - Account summary")) {
        //System.out.println("Title verification passed");
        //} else { System.out.println("Title verification failed");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Zero - Account Summary";
        if (actualTitle.equals(expectedTitle)) {
        System.out.println("Title verification PASSED!");
        } else {
        System.out.println("Title verification FAILED!");
            //if (driver.findElement(By.linkText("Account summary")).getAttribute("href").contains("account-summary")) {
            //  System.out.println("Actual link value verification passed");
            //} else System.out.println("Actual link value verification failed");
        } String actualLinkValue = driver.findElement(By.linkText("Account Summary")).getAttribute("href");
          String expectedInLink = "account-summary";
            if (actualLinkValue.contains(expectedInLink)) {
                System.out.println("Link verification PASSED!");
            } else {
                System.out.println("Link verification FAILED!");

            }
        }
    }