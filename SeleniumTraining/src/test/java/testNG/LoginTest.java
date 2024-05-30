package testNG;

import org.testng.annotations.Test;

import common.BeforeAfterSuite;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class LoginTest extends BeforeAfterSuite {

	@BeforeTest(description = "This is login test")
	public void loginToApplication() {

		System.out.println("Login to the Application");
	}

	@AfterTest(description = "This is logout test")
	public void logoutFromApplication() {

		System.out.println("Logout from Application");
	}

	@BeforeMethod
	public void DBConnection() {

		System.out.println("DataBase is Connected");
	}

	@AfterMethod
	public void DBDisconnection() {

		System.out.println("DataBase is Disconnected");
	}

	@Test(priority = 1)

	public void LogIn() {

		System.out.println("Test_1");

	}

	@Test(priority = 2)
	public void LogOut() {

		System.out.println("Test_2");

	}

}
