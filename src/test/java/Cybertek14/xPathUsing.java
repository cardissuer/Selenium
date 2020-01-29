package Cybertek14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathUsing {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://etsy.com");

        WebElement etsySearch = driver.findElement(By.xpath("//*[@id='global-enhancements-search-query']"));
        etsySearch.sendKeys("postcard");
        WebElement etsyButton = driver.findElement(By.xpath("//button[@value='Search']"));
        etsyButton.click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Postcard";

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification passed");
        } else {
            System.out.println("Title verification failed");
        }
    }
}