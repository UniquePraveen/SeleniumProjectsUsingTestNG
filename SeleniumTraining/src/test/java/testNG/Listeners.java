package testNG;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		Reporter.log("This is a test");
		
		System.out.println("Test Started: " + result.getName());

	}

	public void onTestFailure(ITestResult result) {
		
		Reporter.log("This is a fail test");
		
		System.out.println("Test Failed: " + result.getName());

	}

}
