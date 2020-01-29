package Cybertek14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Checkbox1 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/checkboxes");

        if (driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected() == true){
            System.out.println("1st checkbox is selected");
        } else System.out.println("1st checkbox is NOT selected");

        //if (driver.findElement(By.xpath("//form[@id='checkboxes'] /input[1]")).isSelected() == true){
        //            System.out.println("1st checkbox is selected");
        //        } else System.out.println("1st checkbox is NOT selected");

        if (driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isSelected() == true){
            System.out.println("1st checkbox is selected");
        } else System.out.println("1st checkbox is NOT selected");

        //if (driver.findElement(By.xpath("//form[@id='checkboxes'] /input[2]")).isSelected() == true){
        //            System.out.println("1st checkbox is selected");
        //        } else System.out.println("1st checkbox is NOT selected");

        driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
        driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();

        if (driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected() == true){
            System.out.println("1st checkbox is selected");
        } else System.out.println("1st checkbox is NOT selected");

        //if (driver.findElement(By.xpath("//form[@id='checkboxes'] /input[1]")).isSelected() == true){
        //            System.out.println("1st checkbox is selected");
        //        } else System.out.println("1st checkbox is NOT selected");

        if (driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isSelected() == true){
            System.out.println("1st checkbox is selected");
        } else System.out.println("1st checkbox is NOT selected");

        //if (driver.findElement(By.xpath("//form[@id='checkboxes'] /input[2]")).isSelected() == true){
        //            System.out.println("1st checkbox is selected");
        //        } else System.out.println("1st checkbox is NOT selected");
    }
}
