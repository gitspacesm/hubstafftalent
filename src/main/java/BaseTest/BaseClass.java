package BaseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import GenericUtilities.PropertyUtility;
import GenericUtilities.WebDriverUtility;
import ObjectRepo.HomePage;

public class BaseClass
{
    public GenericUtilities.PropertyUtility propUtil = new PropertyUtility();
    public GenericUtilities.WebDriverUtility driverUtil = new WebDriverUtility();

    public WebDriver driver;


    @BeforeSuite(groups = { "smokeTest", "integrationTest", "systemTest" })
    public void configBS()
    {
        System.out.println("---- Report Configuration ----");
    }

    
    @BeforeClass(groups = { "smokeTest", "integrationTest", "systemTest" })
    public void configBC() throws Exception
    {
        System.out.println("--- Launch Browser ---");

        String browserName = propUtil.getData("browser");

        driver = driverUtil.launchBrowser(browserName);
        driverUtil.maximizeBrowser(driver);
        driverUtil.implicitWait(driver);
        driver.get(propUtil.getData("url"));
    }

    
    @AfterMethod(groups = { "smokeTest", "integrationTest", "systemTest" })
    public void configAM() throws Exception
    {
        System.out.println("-- Logout --");
        try
        {
            HomePage home = new HomePage(driver);
            Actions action = new Actions(driver);
            action.moveToElement(home.getUserImg()).pause(Duration.ofSeconds(2)).click(home.getSignInLink()).build().perform();

            System.out.println("-- Logout Successful --");
        }
        catch (Exception e)
        {
            System.out.println("-- Logout Failed / User Already Logged Out --");
        }
    }


    @AfterClass(groups = { "smokeTest", "integrationTest", "systemTest" })
    public void configAC()
    {
        if (driver != null)
        {
            driver.quit();
        }

        System.out.println("--- Close Browser ---");
    }


    @AfterSuite(groups = { "smokeTest", "integrationTest", "systemTest" })
    public void configAS()
    {
        System.out.println("---- Close Report ----");
    }

}