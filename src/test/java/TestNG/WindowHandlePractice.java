package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowHandlePractice {
    WebDriver driver = new ChromeDriver();

//    @BeforeClass
//    public void setup() {
//
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("http://practice.cybertekschool.com/windows");
//    }
//        @Test
//        public void windowOne () {
//        String mainHandle = driver.getWindowHandle();
//        //System.out.println(mainHandle);
//        Assert.assertEquals(driver.getTitle(), "Practice", "Verification FAILED");
//
//        driver.findElement(By.xpath("//a[.='Click Here']")).click();
//
//        for (String handle: driver.getWindowHandles()){
//            if (!handle.equals(mainHandle)){
//                driver.switchTo().window(handle);
//            }
//            System.out.println(driver.getTitle());
//            //Assert.assertEquals(driver.getTitle(),"New Window", "Verification FAILED");
//        }

//        driver.switchTo().window("New window");
//        Assert.assertTrue(driver.getTitle().equals("New Window"), ("Verification FAILED"));

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/windows");
    }
    @Test
    public void windowHandlingTest(){
        String mainHandle = driver.getWindowHandle();
        System.out.println(mainHandle);
        // #4 assert title= Practice
        String actualTitle = driver.getTitle();
        String expectedTitle = "Practice";
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle, "Titles are not matching!!!");
        // #5 clicking to the link to get new tab
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();
        //System.out.println(driver.getTitle());
        for(String handle : driver.getWindowHandles()){
            if(!handle.equals(mainHandle)){
                driver.switchTo().window(handle);
            }
        }
        System.out.println(driver.getTitle());
        String expectedTitleAfterClick = "New Window";
        String actualTitleAfterClick = driver.getTitle();
        Assert.assertEquals(actualTitleAfterClick, expectedTitleAfterClick, "Titles are not matching!!");
    }
}