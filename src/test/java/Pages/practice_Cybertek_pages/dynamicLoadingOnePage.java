package Pages.practice_Cybertek_pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dynamicLoadingOnePage {

    public dynamicLoadingOnePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//button [.='Start']")
    public WebElement startButton;

    @FindBy (id = "username")
    public WebElement username;

    @FindBy (id = "pwd")
    public WebElement password;
}
