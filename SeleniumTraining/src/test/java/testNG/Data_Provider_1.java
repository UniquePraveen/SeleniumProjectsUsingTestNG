package testNG;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data_Provider_1 {
	
	@DataProvider(name = "Create")
	public Object[][] dataProvider1(Method m) {

		Object[][] testdata = null;
		
		if(m.getName().equals("test1")) {
			
			testdata =  new Object[][] { 
				{ "UserName1", "Password1" }, 
				{ "UserName2", "Password2" }, 
				{ "UserName3", "Password3" },
				{ "UserName4", "Password4" }
			};
			
		}
		
		else if(m.getName().equals("test2")) {
			
			testdata = new Object[][] { 
				{ "UserName1", "Password1","Test1" }, 
				{ "UserName2", "Password2","Test2" }, 
				{ "UserName3", "Password3","Test3" },
				{ "UserName4", "Password4","Test4" }
			};
			
		}
		return testdata;
		
		
	}

	
}
