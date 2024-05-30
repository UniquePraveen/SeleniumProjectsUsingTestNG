package testNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippingTestCases {

	boolean dataSetup = true;

	@Test(enabled = false)
	public void method_1() {

		System.out.println("Skipping this test_1");
	}

	@Test
	public void method_2() {

		System.out.println("Skipping this test_2");
		throw new SkipException("Skipping this test forcefully");
	}

	@Test
	public void method_3() {

		System.out.println("Skipping this test_3 based on condition");

		if (dataSetup == true) {
			System.out.println("Execute the test");
		}

		else {
			
			System.out.println("Dont execute further steps");
			throw new SkipException("Don't execute further steps");

		}

	}

}
