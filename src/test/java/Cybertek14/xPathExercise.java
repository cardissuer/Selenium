package Cybertek14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathExercise {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://accounts.google.com/signin");
        driver.findElement(By.xpath("//input [@type='email']")).sendKeys("cardissuer@gmail.com");
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input.whsOnd.zHQkBf")).sendKeys("NordStage2SW73");
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
    }
}