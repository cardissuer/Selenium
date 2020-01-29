package Cybertek14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuAppUrlVerification {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://the-internet.herokuapp.com/forgot_password");
        driver.findElement(By.id("email")).sendKeys("cardissuer@mail.ru" + Keys.ENTER);
        if (driver.getCurrentUrl().contains("email_sent")) {
            System.out.println("Url is correct");
        } else System.out.println("Url isn't correct");
    }
}