package ObjectRepo;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class CandidatePage {

	    WebDriver driver;

	    public CandidatePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//a[contains(text(),'Freelancers')]")
	    private WebElement freelancersMenu;

	    @FindBy(xpath = "//input[contains(@placeholder,'Search')]")
	    private WebElement searchBox;

	    @FindBy(xpath = "//button[contains(.,'Search')]")
	    private WebElement searchButton;

	    @FindBy(xpath = "//a[contains(@href,'profile')]")
	    private WebElement candidateProfile;

	    @FindBy(xpath = "//*[contains(@class,'skill')]")
	    private WebElement skills;

	    @FindBy(xpath = "//*[contains(@class,'experience')]")
	    private WebElement experience;


	    public WebElement getFreelancersMenu() {
	        return freelancersMenu;
	    }

	    public WebElement getSearchBox() {
	        return searchBox;
	    }

	    public WebElement getSearchButton() {
	        return searchButton;
	    }

	    public WebElement getCandidateProfile() {
	        return candidateProfile;
	    }

	    public WebElement getSkills() {
	        return skills;
	    }

	    public WebElement getExperience() {
	        return experience;
	    }

	    // Open Freelancers/Candidates
	    public void clickFreelancers() {
	        getFreelancersMenu().click();
	    }

	    // Search Candidate
	    public void searchCandidate(String candidateName) {
	        getSearchBox().clear();
	        getSearchBox().sendKeys(candidateName);
	        getSearchButton().click();
	    }

	    // Open CandidateProfile
	    public void clickCandidateProfile() {
	        getCandidateProfile().click();
	    }

	    // Get Skills
	    public String getCandidateSkills() {
	        return getSkills().getText();
	    }

	    // Get Experience
	    public String getCandidateExperience() {
	        return getExperience().getText();
	    }
}
