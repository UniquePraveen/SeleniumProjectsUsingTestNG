package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





@Test
public class Login_Test {
	
	@Parameters({"browser"})
	@Test
	public void LogIn(String browser) {
		
		
		if(browser.equals("chrome")) {
			
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			
			driver.close();

		}
		
	
		
				
		
	}

}
