package testNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@BeforeClass
	public void BeforeClass() {

		System.out.println("This execute before class");

	}

	@AfterClass
	public void AfterClass() {

		System.out.println("This execute after class");

	}

	@BeforeGroups(value = "Regression")
	public void BeforeGroups() {

		System.out.println("This execute before groups");

	}

	@AfterGroups(value = "BVM")
	public void AfetrGroups() {

		System.out.println("This Execute after groups");
	}

	@Test(groups = "Regression")
	public void Test_1() {

		System.out.println("This is a Test_1");
	}

	@Test(groups = "Regression")
	public void Test_2() {

		System.out.println("This is a Test_2");
	}

	@Test(groups = "Regression")
	public void Test_3() {

		System.out.println("This is a Test_3");
	}

	@Test(groups = "Regression")
	public void Test_4() {

		System.out.println("This is a Test_4");
	}

	@Test(groups = "Regression")
	public void Test_5() {

		System.out.println("This is a Test_5");
	}

	@Test(groups = "BVM")
	public void Test_6() {

		System.out.println("This is a Test_6");
	}

	@Test(groups = "BVM")
	public void Test_7() {

		System.out.println("This is a Test_7");
	}

	@Test(groups = "BVM")
	public void Test_8() {

		System.out.println("This is a Test_8");
	}

	@Test(groups = { "BVM", "Regression" })
	public void Test_9() {

		System.out.println("This is a Test_9");
	}

}
