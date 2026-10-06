package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployerPage{
	
	    WebDriver driver;

	    public EmployerPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//a[contains(text(),'Employers')]")
	    private WebElement employerMenu;

	    @FindBy(xpath = "//a[contains(.,'Post a Job')]")
	    private WebElement postJobButton;

	    @FindBy(xpath = "//input[@name='title']")
	    private WebElement jobTitle;

	    @FindBy(xpath = "//textarea[@name='description']")
	    private WebElement jobDescription;

	    @FindBy(xpath = "//input[contains(@placeholder,'skill')]")
	    private WebElement skills;

	    @FindBy(xpath = "//input[contains(@name,'budget')]")
	    private WebElement budget;

	    @FindBy(xpath = "//button[contains(.,'Post Job')]")
	    private WebElement submitButton;

	    @FindBy(xpath = "//a[contains(.,'Profile')]")
	    private WebElement employerProfile;


	    public WebElement getEmployerMenu() {
	        return employerMenu;
	    }

	    public WebElement getPostJobButton() {
	        return postJobButton;
	    }

	    public WebElement getJobTitle() {
	        return jobTitle;
	    }

	    public WebElement getJobDescription() {
	        return jobDescription;
	    }

	    public WebElement getSkills() {
	        return skills;
	    }

	    public WebElement getBudget() {
	        return budget;
	    }

	    public WebElement getSubmitButton() {
	        return submitButton;
	    }

	    public WebElement getEmployerProfile() {
	        return employerProfile;
	    }

	    // Click Employer section
	    public void clickEmployer() {
	        getEmployerMenu().click();
	    }

	    public void clickPostJob() {
	        getPostJobButton().click();
	    }

	    public void enterJobTitle(String title) {
	        getJobTitle().sendKeys(title);
	    }
	    
	    public void enterJobDescription(String description) {
	        getJobDescription().sendKeys(description);
	    }

	    public void enterSkills(String skill) {
	        getSkills().sendKeys(skill);
	    }

	    public void postJob() {
	        getSubmitButton().click();
	    }

	    public void clickEmployerProfile() {
	        getEmployerProfile().click();
	    }
}
