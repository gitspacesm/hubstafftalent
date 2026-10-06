import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginToApp{
	
	@Test
	public void login() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://202.83.16.221:9003/");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Signup")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(""));
		
	}
}
