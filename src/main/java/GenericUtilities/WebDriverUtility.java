package GenericUtilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	 public WebDriver driver;
		
		public WebDriver launchBrowser(String browser) {
			if(browser.equalsIgnoreCase("chrome"))
				driver= new ChromeDriver();
			else if(browser.equalsIgnoreCase("firefox"))
				driver=new FirefoxDriver();
			else if(browser.equalsIgnoreCase("edge"))
				driver= new EdgeDriver();
			else
				driver= new ChromeDriver();
			return driver;
		}
		
		public void maximizeBrowser(WebDriver driver2){
			driver.manage().window().maximize();
			
		}
		
		 public void implicitWait(WebDriver driver){
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		 }
		
		 public void mouseHover(WebDriver driver, WebElement element){
			 Actions actions = new Actions(driver);
			 actions.moveToElement(element).perform();
		    
		 }
		
		 public void enterText(WebElement element, String text){
			 element.clear();
			 element.sendKeys(text);
		    
		 }
		 
		 public void selectByVisibleText(WebElement element, String text){
		        Select select = new Select(element);
		        select.selectByVisibleText(text);
		    
		 }
		 
		 public void selectByIndex(WebElement element, int index){
		        Select select = new Select(element);
		        select.selectByIndex(index);
		    
		 }
		 
		 public void scrollToElement(WebDriver driver, WebElement element){
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].scrollIntoView(true);",element);
		    
		 }
		 
		 public void acceptAlert(WebDriver driver){
		        driver.switchTo().alert().accept();
		    
		 }
		 
		 public void dismissAlert(WebDriver driver){
			 driver.switchTo().alert().dismiss();
			 
		 }
		 
		 public void refreshPage(WebDriver driver){
			 driver.navigate().refresh();
			
		 }
		 
		 
}
