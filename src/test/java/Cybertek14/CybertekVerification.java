package Cybertek14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://cybertekschool.okta.com");
        if (driver.getCurrentUrl().contains("cybertekschool")){
            System.out.println("Verification of website passed good");
        } else System.out.println("Verification of cybertekschool failed");
        if (driver.getTitle().contains("Cybertek")){
            System.out.println("Title verification passed good");
        } else System.out.println("Verification of title failed");
    }
}
