package Pages.synchronization_pages;

import Pages.practice_Cybertek_pages.dynamicLoadingOnePage;
import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitTest {

    @Test
    public void WaitForInputBoxTest (){
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
        dynamicLoadingOnePage dynamicLoadingOnePage = new dynamicLoadingOnePage ();
        dynamicLoadingOnePage.startButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(dynamicLoadingOnePage.username));
        dynamicLoadingOnePage.username.sendKeys("tomsmith");
        dynamicLoadingOnePage.password.sendKeys("is dumb");
    }
}

//@Test
//    public void waitForInputBoxTest(){
//        //1- get the page
//        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
//        //2- create object to use webElements
//        DynamicLoading1Page dynamicLoading1Page = new DynamicLoading1Page();
//        //3- click to start button
//        dynamicLoading1Page.startButton.click();
//        //4- we create the WebDriverWait class object and pass driver and seconds
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
//        wait.until(ExpectedConditions.visibilityOf(dynamicLoading1Page.usernameInput));
//        dynamicLoading1Page.usernameInput.sendKeys("tomsmith");
//    }
//}
