package TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestNGClass {

    @Test
    public void bfirstTest (){
        System.out.println("1st test is running...");
        Assert.assertEquals("actualValue", "notActualValue", "First test is failed.");
    }
    @Test
    public void asecondTest () {
        System.out.println("2nd test is running...");
        Assert.assertTrue("sentence".contains("o"), "Sentence doesn't contain given sentence");
    }

    @BeforeClass
    public void setup (){
        System.out.println("Before class is running...");
    }

    @BeforeMethod
    public void beforeMethod () {
        System.out.println("Before method is running...");
    }

    @AfterMethod
    public void afterMethod () {
        System.out.println("After method is running...");
        }

        @AfterClass
    public void afterClass () {
            System.out.println("After class is running...");
        }
    }