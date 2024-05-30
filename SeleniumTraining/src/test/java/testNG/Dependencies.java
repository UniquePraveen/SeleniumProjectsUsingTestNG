package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencies {
	
	@Test
	public void userRegistration() {
		
		System.out.println("User Registration Success!");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = "userRegistration")
	public void userSearch() {
		
		System.out.println("UserSearche xecute when user registartion get Success");
	}

}
