package ActionsTest;

import Pages.practice_Cybertek_pages.HoversPage;
import Utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoversTest {

    //TC	#15:	Hover	Test1.Go	to	http://practice.cybertekschool.com/hovers
    // 2.Hover	over	to	first	image
    // 3.Assert:	a.“name:	user1”	is	displayed
    // 4.Hover	over	to	second	image
    // 5.Assert:	a.“name:	user2”	is	displayed
    // 6.Hover	over	to	third	image
    // 7.Confirm:	a.“name:	user3”	is	disp

    @Test
    public void HoverTest (){
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        HoversPage HoversPage = new HoversPage ();
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(HoversPage.image1).perform();
        Assert.assertTrue(HoversPage.text1.isDisplayed());

        actions.moveToElement(HoversPage.image2).perform();
        Assert.assertTrue(HoversPage.text2.isDisplayed());

        actions.moveToElement(HoversPage.image3).perform();
        Assert.assertTrue(HoversPage.text3.isDisplayed());

    }
}