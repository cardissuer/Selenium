package Pages.practice_Cybertek_pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoversPage {

    public HoversPage () {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='example']/div[1]/img")
    public WebElement image1;
    @FindBy (xpath = "//div[@class='example']/div[2]/img")
    public WebElement image2;
    @FindBy (xpath = "//div[@class='example']/div[3]/img")
    public WebElement image3;
    @FindBy(xpath = "(//div[@class='figcaption']/h5)[1]")
    public WebElement text1;
    @FindBy(xpath = "(//div[@class='figcaption']/h5)[2]")
    public WebElement text2;
    @FindBy(xpath = "(//div[@class='figcaption']/h5)[3]")
    public WebElement text3;

}
