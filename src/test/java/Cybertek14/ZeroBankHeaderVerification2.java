package Cybertek14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHeaderVerification2 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://zero.webappsecurity.com/login.html");
        if (driver.findElement(By.partialLinkText("Forgot your")).getAttribute("href").contains("/forgot-password.html")){
         System.out.println("Link verification passed");
        } else System.out.println("Link verification failed");
    }
}