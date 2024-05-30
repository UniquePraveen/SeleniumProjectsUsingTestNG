package testNG;

import org.testng.annotations.Test;

public class Data_Provider {

	@Test(dataProvider = "Create", dataProviderClass = Data_Provider_1.class)
	public void test1(String username, String password) {

		System.out.println(username + "=======" + password);

	}

	@Test(dataProvider = "Create", dataProviderClass = Data_Provider_1.class)
	public void test2(String username, String password, String test) {

		System.out.println(username + "=======" + password + "======" + test);

	}

}
