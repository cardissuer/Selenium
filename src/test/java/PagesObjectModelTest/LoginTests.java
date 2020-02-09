package PagesObjectModelTest;

import Pages.Vytrack_Pages.VyTrackLoginPage;
import Utilities.Config;
import VyTrack.VyTrackLogin;
import org.junit.Test;

public class LoginTests {

    @Test
    public void positiveLoginScenario(){

        String username = Config.getProperty("storemanagerUsername");
        String password = Config.getProperty("storemanagerPassword");

        VyTrackLoginPage vytrackLoginPage = new VyTrackLoginPage();
        vytrackLoginPage.usernameInput.sendKeys(username);
        vytrackLoginPage.passwordInput.sendKeys(password);
        vytrackLoginPage.loginButton.click();
    }
}