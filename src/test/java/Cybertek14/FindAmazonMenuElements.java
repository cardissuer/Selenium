package Cybertek14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindAmazonMenuElements {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");

        List<WebElement> items = driver.findElements(By.xpath("//a[@class='hmenu hmenu-visible']/li"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // int expectedNum = 36;
        // int actualNum = items.size();
        // if(expectedNum == actualNum){
        // System.out.println("List size verification PASSED!");
        // }else{
        // System.out.println("List size verification FAILED!!!");
        System.out.println(items.size());
    }
}