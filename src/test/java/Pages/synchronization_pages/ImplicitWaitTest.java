package Pages.synchronization_pages;

import Pages.practice_Cybertek_pages.dynamicLoadingPage;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImplicitWaitTest {

    @Test
    public void ThreadSleepTest ()  {

        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/2");
        dynamicLoadingPage dynamicLoadingPage = new dynamicLoadingPage();
        dynamicLoadingPage.startButton.click();
        //Thread.sleep(2000);
        Assert.assertTrue(dynamicLoadingPage.helloWorldText.isDisplayed(), "Text is NOT displayed on the page");

    }
}