package Cybertek14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.NoSuchElementException;

public class Hmwrk24JanTask1 {
    public static void main(String[] args) throws InterruptedException {

        //XPATH PRACTICES
        // DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        // TC #1: PracticeCybertek.com_ForgotPasswordWebElement verification
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        // 2.Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // 3.Locate all theWebElements on the page using XPATH locator only (total of 6)
        // a.“Home”link
        //        WebElement homeLink = driver.findElement(By.xpath("//a[.='Home']"));
        if (driver.findElement(By.xpath("//a[@class='nav-link']")).isDisplayed()) {
            System.out.println("Home link verification passed");
        } else System.out.println("Home link verification failed");
        //b.“Forgot password”header
        //        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//div[@class='example']/h2"));
        if (driver.findElement(By.xpath("//h2[contains(text(),'Forgot Password')]")).isDisplayed()) {
            System.out.println("Forgot password header verification passed");
        } else System.out.println("Forgot password header verification failed");
        // c.“E-mail”text
        //        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));
        if (driver.findElement(By.xpath("//label[contains (text(), 'E-mail')]")).isDisplayed()) {
            System.out.println("Email text verification passed");
        } else System.out.println("Email text verification failed");
        // d.E-mailinput box
        //        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
        if (driver.findElement(By.xpath("//input[@type='text']")).isDisplayed()) {
            System.out.println("Email input verification passed");
        } else System.out.println("Email input verification failed");
        // e.“Retrieve password”button
        //        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));
        if (driver.findElement(By.xpath("//i[contains(@class,'icon-2x icon-signin')]")).isDisplayed()) {
            System.out.println("Retrieve password verification passed");
        } else System.out.println("Retrieve password verification failed");
        // f.“Powered by Cybertek School”text
        //        WebElement footerText = driver.findElement(By.xpath("//a[.='Cybertek School']/.."));
        if (driver.findElement(By.xpath("//div[contains(text(),'Powered by')]")).isDisplayed()) {
            System.out.println("Powered by Cybertek verification passed");
        } else System.out.println("Powered by Cybertek verification failed");
        // 4.Verify allWebElements are displayed
    }

    //Gurhan way to make it
    // //TC #1: PracticeCybertek.com_ForgotPasswordWebElement verification
    //        // 1.Open Chrome browser
    //        // 2.Go to http://practice.cybertekschool.com/forgot_password
    //        WebDriverManager.chromedriver().setup();
    //        WebDriver driver = new ChromeDriver();
    //        driver.manage().window().maximize();;
    //        driver.get("http://practice.cybertekschool.com/forgot_password");
    //        // 3.Locate all theWebElements on the page using XPATH locator only (total of 6)
    //        // a.“Home”link
    //        WebElement homeLink = driver.findElement(By.xpath("//a[.='Home']"));
    //        // b.“Forgot password”header
    //        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//div[@class='example']/h2"));
    //        // c.“E-mail”text
    //        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));
    //        // d.E-mail input box
    //        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
    //        // e.“Retrieve password”button
    //        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));
    //        //button[.='Retrieve password']
    //        // f.“Powered by Cybertek School”text
    //        WebElement footerText = driver.findElement(By.xpath("//a[.='Cybertek School']/.."));
    //        // 4.Verify allWebElements are displayed.
    //        if(homeLink.isDisplayed() && forgotPasswordHeader.isDisplayed() && emailLabel.isDisplayed()
    //                && emailInput.isDisplayed() && retrievePasswordButton.isDisplayed()
    //        && footerText.isDisplayed())
    //        {
    //            System.out.println("All web elements are displayed");
    //        }else{
    //            System.out.println("One or more of the webElements are not displayed!");
}