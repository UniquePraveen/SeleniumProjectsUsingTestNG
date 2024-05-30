package testNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common.BeforeAfterSuite;

public class Soft_Assert extends BeforeAfterSuite{

	@Test
	public void TitleTest() {

		SoftAssert softassert = new SoftAssert();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");

		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";

		String actualTitle = driver.getTitle();

		softassert.assertEquals(actualTitle, expectedTitle, "Title Verification failed");

		String expectedText = "Search";

		String actualText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");

		softassert.assertEquals(actualText, expectedText, "Text verification failed");

		driver.quit();

		softassert.assertAll();

	}

}
