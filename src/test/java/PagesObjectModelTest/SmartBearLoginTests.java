package PagesObjectModelTest;

import Pages.smartbear_pages.LoginPage;
import Utilities.Config;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmartBearLoginTests {

    LoginPage LoginPage = new LoginPage();

    //TC #20: Wrong username
    // 1. Go to websitehttp://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx(Linkstoanexternalsite.)
    // 2. Try to login with wrong username
    // 3. Verify error messageInvalid Login or Password

    @Test
    public void wrongUsernameTest (){

        Driver.getDriver().get(Config.getProperty("smartBearUrl"));

        String wrongUsername = Config.getProperty("wrongUsername");
        LoginPage.usernameInput.sendKeys(wrongUsername);

        String wrongPassword = Config.getProperty("wrongPassword");
        LoginPage.passwordInput.sendKeys (wrongPassword);

        LoginPage.loginButton.click();

        Assert.assertTrue(LoginPage.errorMessage.isDisplayed(), "Error message isn't displayed");
    }

    //TC #21: Wrong password
    // 1. Go toSmartbearlogin page
    // 2. Try to login with wrong password
    // 3. Verify error messageInvalid Login or Password

    @Test
    public void wrongPasswordTest () {

        Driver.getDriver().get(Config.getProperty("smartBearUrl"));

        LoginPage.usernameInput.sendKeys(Config.getProperty("correctUsername"));

        String wrongPassword = Config.getProperty("wrongPassword");
        LoginPage.passwordInput.sendKeys("wrongPassword");

        LoginPage.loginButton.click();

        Assert.assertEquals(LoginPage.errorMessage.getText(), "Invalid Login or Password.", "Error message is displayed");
    }

    //TC #22: No username
    // 1. Go to Smartbearlogin page
    // 2. Try to login no username
    // 3. Verify error messageInvalid Login or Password

    @Test
    public void noUsername (){

        Driver.getDriver().get(Config.getProperty("smartBearUrl"));
        LoginPage.passwordInput.sendKeys(Config.getProperty("correctPassword"));

        LoginPage.loginButton.click();

        Assert.assertEquals(LoginPage.errorMessage.getText(), "Invalid Login or Password.", "Error message is displayed");
    }

    //TC #23: No password
    // 1. Go to Smartbearlogin page
    // 2. Try to login with no password
    // 3. Verify error messageInvalid Login or Password

    @Test
    public void noPassword () {

        Driver.getDriver().get(Config.getProperty("smartBearUrl"));
        LoginPage.usernameInput.sendKeys(Config.getProperty("correctUsername"));

        LoginPage.loginButton.click();

        Assert.assertEquals(LoginPage.errorMessage.getText(), "Invalid Login or Password.", "Error message is displayed");
    }
}

//package pageObjectModelTests;
//    import org.testng.Assert;
//    import org.testng.annotations.BeforeMethod;
//    import org.testng.annotations.Test;
//    import pages.smartbear_pages.LoginPage;
//    import utilites.Config;
//    import utilites.Driver;
//    public class SmartBearLoginTests {
//        LoginPage loginPage = new LoginPage();
//        @BeforeMethod
//        public void setUp(){
//            //1- we get the page
//            Driver.getDriver().get(Config.getProperty("smartbearUrl"));
//        }
//        @Test
//        public void wrongUsernameTest(){
//            //2- we enter wrong username
//            String wrongusername = Config.getProperty("wrongUsername");
//            loginPage.usernameInput.sendKeys(wrongusername);
//            //3- we enter correct password
//            String correctpassword = Config.getProperty("correctPassword");
//            loginPage.passwordInput.sendKeys(correctpassword);
//            //4- click login button
//            loginPage.loginButton.click();
//            //5- verify error message
//            Assert.assertTrue(loginPage.errorMessage.isDisplayed(), "Error message is NOT displayed!");
//        }
//        @Test
//        public void wrongPasswordTest(){
//            //1- getting the page in before method
//            //2- enter correct username
//            loginPage.usernameInput.sendKeys(Config.getProperty("correctUsername"));
//            //3- enter wrong password
//            loginPage.passwordInput.sendKeys(Config.getProperty("wrongPassword"));
//            //4- click to login button
//            loginPage.loginButton.click();
//            //5- assert error message is displayed
//            Assert.assertTrue(loginPage.errorMessage.isDisplayed(), "Error message is NOT displayed!");
//        }
//        @Test
//        public void noUsernameTest(){
//            //1- getting the page in beforeMethod
//            //2- not entering username
//            //3- enter correct password
//            loginPage.passwordInput.sendKeys(Config.getProperty("correctPassword"));
//            //4- click login button
//            loginPage.loginButton.click();
//            //5- assert error message is displayed
//            Assert.assertTrue(loginPage.errorMessage.isDisplayed(), "Error message is NOT displayed!");
//        }
//        @Test
//        public void noPasswordTest(){
//            //1- Getting the page in beforemethod
//            //2- enter correct username
//            loginPage.usernameInput.sendKeys(Config.getProperty("correctUsername"));
//            //3- we DO NOT enter password
//            //4- click to login button
//            loginPage.loginButton.click();
//            //5- assert error message is displayed
//            Assert.assertTrue(loginPage.errorMessage.isDisplayed(), "Error message is NOT displayed!");
//        }
//    }