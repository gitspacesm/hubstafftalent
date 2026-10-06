package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Sign in")
	private WebElement SignInLink;
	
	@FindBy(xpath = "//input[@placeholder='Search profiles']")
	private WebElement SearchProfiles;
	
	@FindBy(xpath = "//input[@placeholder='Search profiles by name or keywords']")
	private WebElement SearchByName_Keywords;
	
	@FindBy(linkText = "Post a job (FREE)")
	private WebElement PostJobBtn;
	
	@FindBy(linkText = "Browse jobs")
	private WebElement BrowserJobsLink;

	@FindBy(linkText ="Looking for work")
	private WebElement LookingForJobsLink;
	
	@FindBy(linkText ="Looking to hire")
	private WebElement LookingToHireLink;
	
	
	public WebElement getSignInLink() {
		return SignInLink;
	}
	
	public WebElement getSearchByName_Keywords() {
		return SearchByName_Keywords;
	}
	
	public WebElement getSearchProfiles() {
		return SearchProfiles;
	}
	
	public WebElement getPostJob() { 
		return PostJobBtn;
	}
	
	public WebElement getBrowserJobsLink() {
		return BrowserJobsLink;
	}
	
	public WebElement getLookingForJobs() {
		return LookingForJobsLink;
	}
	
	public WebElement getLookingToHire() {
		return LookingToHireLink;
	}

	public WebElement getUserImg() {
		// TODO Auto-generated method stub
		return null;
	}

}
