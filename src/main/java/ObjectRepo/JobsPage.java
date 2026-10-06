package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class JobsPage
{
    WebDriver driver;

    public JobsPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Search jobs text box
    @FindBy(xpath = "//input[contains(@placeholder,'Search by keywords')]")
    private WebElement searchJob;

    // Search jobs button
    @FindBy(xpath = "//button[contains(normalize-space(),'Search jobs')]")
    private WebElement searchButton;

    // First job result
    @FindBy(xpath = "(//*[contains(@class,'job')])[1]")
    private WebElement jobResult;

    // Employer / company link from job details
    @FindBy(xpath = "//a[contains(@href,'profile') or contains(@href,'company')]")
    private WebElement employerProfile;


    public WebElement getSearchJob()
    {
        return searchJob;
    }

    public WebElement getSearchButton()
    {
        return searchButton;
    }

    public WebElement getJobResult()
    {
        return jobResult;
    }

    public WebElement getEmployerProfile()
    {
        return employerProfile;
    }


    public void verifyEmployerProfile()
    {
        Assert.assertTrue(
                getEmployerProfile().isDisplayed(),
                "Employer profile is not displayed.");
    }
}