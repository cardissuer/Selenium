package Pages.smartbear_pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //We are creating a POM page
    // 1. Create a constructor which will call PageFactory Method

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    // 2- @FindBy annotation to locate webElements

    @FindBy (id = "ctl00_MainContent_username")
    public WebElement usernameInput;

    @FindBy (id = "ctl00_MainContent_password")
    public WebElement passwordInput;

    @FindBy (id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(id = "ctl00_MainContent_status")
    public WebElement errorMessage;
}