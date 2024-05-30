package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import common.BeforeAfterSuite;

@Test(groups = "User Registration")
public class GroupTesting extends BeforeAfterSuite {

	@Test(groups = "Regression")
	public void Test1() {

		System.out.println("Test 1");

	}

	@Test(groups = { "Regression", "BVM" })
	public void Test2() {

		System.out.println("Test 2");

	}

	@Test(groups = "Regression")
	public void Test3() {

		System.out.println("Test 3");
		Assert.assertTrue(false);

	}

	@Test(groups = { "Regression", "BVM" })
	public void Test4() {
		
		Reporter.log("This is test4");
		System.out.println("Test 4");

	}

}
