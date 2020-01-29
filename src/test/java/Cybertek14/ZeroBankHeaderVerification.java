package Cybertek14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHeaderVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://zero.webappsecurity.com/login.html");

        if (driver.findElement(By.className("page-header")).getText ().equalsIgnoreCase("Log in to ZeroBank")) {
            System.out.println("Ok");
        } else {
            System.out.println("Not ok");
        }
    }
}