import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class manualtest {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://hubstafftalent.net/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(4000);
	
		
		driver.findElement(By.name("user[email]")).sendKeys("susmitam.99@outlook.com");
		Thread.sleep(1000);
		driver.findElement(By.name("user[password]")).sendKeys("Qwerty@123"); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-disable-with='Logging in…']")).click(); 
		Thread.sleep(2000);
		
		Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.className("hi hi-caret"));
		a.moveToElement(ele).perform();
	
		a.moveToElement(null);
		Select s = new Select(driver.findElement(By.className("avatar avatar-speck")));
		s.selectByVisibleText("Sign out"); 
		
		Thread.sleep(2000);
		driver.quit();
	}

}
