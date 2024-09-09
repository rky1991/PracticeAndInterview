package anottations;

import org.testng.Reporter;
import org.testng.annotations.*;

public class DataProviderExample {
	
	// Return Type of Data type is Object type
	
	@DataProvider(name="data")
	public Object[][] loginTestData() {
		return new Object[][] {
			{"UserName1","Password1"},
			{"UserName2","Password2"},
			{"UserName3","Password3"}
		};
	}
	@Test(dataProvider = "data")
	public void loginTest(String userName, String password) {
		// Test case steps to login into application 
		Reporter.log(userName);
		Reporter.log(password);
		System.out.println("UserName -->"+userName);
		System.out.println("Password -->>"+password);
		
	}

}
