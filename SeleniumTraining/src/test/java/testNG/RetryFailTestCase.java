package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailTestCase {
	
	@Test(retryAnalyzer = common.RetryFailTestCases.class)
	public void OpenBrowser() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.quit();
		Assert.assertTrue(false);
		
	}

}
