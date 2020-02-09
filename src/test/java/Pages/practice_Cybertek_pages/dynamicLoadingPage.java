package Pages.practice_Cybertek_pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dynamicLoadingPage {

    public dynamicLoadingPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy (xpath = "//button [.='Start']")
        public WebElement startButton;

        @FindBy (xpath = "//div[@id = 'finish']/h4")
        public WebElement helloWorldText;
    }
