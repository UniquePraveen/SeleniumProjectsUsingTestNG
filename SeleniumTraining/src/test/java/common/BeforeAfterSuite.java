package common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeAfterSuite {

	@BeforeSuite
	public void BeforeSuite() {

		System.out.println("This test execute before the suite");
	}

	@AfterSuite
	public void AfterSuite() {

		System.out.println("This test execute after the suite");
	}

}
