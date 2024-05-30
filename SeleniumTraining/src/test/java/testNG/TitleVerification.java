package testNG;

import org.testng.annotations.Test;
import common.BeforeAfterSuite;
import org.testng.AssertJUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification extends BeforeAfterSuite {

	@Test(groups = "Regression")

	public void TitleVerify() {

		String expected = "Electronics, Cars, Fashion, Collectibles & More | eBay";

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");

		String actual = driver.getTitle();

		AssertJUnit.assertEquals(actual, expected);

		driver.quit();

	}

}
