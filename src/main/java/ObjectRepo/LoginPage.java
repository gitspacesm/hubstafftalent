package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="user[email]")
	private WebElement Username;
	
	@FindBy(id="user_password")
	private WebElement Password;
	
	@FindBy(xpath="//a[@class='forgot-password-link']")
	private WebElement ForgotPassword;
	
	@FindBy(linkText="Sign in")
	private WebElement SignInBtn;
	
	
	public WebElement getUsername() {
		return Username;
	}
	
	public WebElement getPassword() {
		return Password;
	}
	
	public WebElement getForgotPassword() {
		return ForgotPassword;
	}
	
	public WebElement getSignInBtn() {
		return SignInBtn;
	}

	public void loginToApplication(String username1, String password1)
	{
	    getUsername().sendKeys(username1);
	    getPassword().sendKeys(password1);
	    getSignInBtn().click();
	}
}
