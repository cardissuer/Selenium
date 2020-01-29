 package Cybertek14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.google.com");

        driver.findElement(By.linkText("Gmail")).click();
        if (driver.getTitle().contains("Gmail")) {
            System.out.println("Gmail was found");
        } else System.out.println("Gmail wasn't found");
        driver.navigate().back();
        if (driver.getTitle().contains("Google")) {
            System.out.println("Google was found");
        } else System.out.println("Google wasn't found");
        driver.navigate().forward();
        if (driver.getTitle().contains("Gmail")) {
            System.out.println("Gmail was found");
        } else System.out.println("Gmail wasn't found");
    }
}