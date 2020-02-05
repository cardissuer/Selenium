package Framework;

import Utilities.Config;
import Utilities.VyTrackUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

    @Test
    public void test1() throws IOException {

//        1) Create the path of the file (current location)

        String path = "test.properties";

//        2) Make a properties object

        Properties properties = new Properties();

//        3) Open the file using FileInputStream

        FileInputStream file = new FileInputStream (path);

//        4) Load the properties file into a properties object

        properties.load(file);

//        5) Read the values using getProperty method

        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));
    }

    @Test
    public void testWithUtil () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        driver.get(Config.getProperty("vyTrackUrl"));
        VyTrackUtils.login(driver, Config.getProperty("storemanagerUsername"),Config.getProperty("storemanagerPassword"));
    }
}