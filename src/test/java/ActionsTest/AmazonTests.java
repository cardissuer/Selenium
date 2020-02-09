package ActionsTest;

import Pages.amazon_pages.amazonLandingPage;
import Pages.practice_Cybertek_pages.HoversPage;
import Utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AmazonTests {

    @Test
    public void signInHoverTest (){
        Driver.getDriver().get("https://www.amazon.com");
        amazonLandingPage amazonLandingPage = new amazonLandingPage ();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(amazonLandingPage.signInLink).perform();
    }
}

// @Test
//    public void signInLinkHoverTest(){
//        //1- get the page first
//        Driver.getDriver().get("https://amazon.com");
//        //2- create the object of Pages class to reach web elements
//        AmazonLandingPage amazonLandingPage = new AmazonLandingPage();
//        //3- create the object of Actions class, and pass driver instance
//        //into the constructor
//        Actions actions = new Actions(Driver.getDriver());
//        //4- we will move to the link using actions instance and method
//        actions.moveToElement(amazonLandingPage.signInLink).perform();
//    }