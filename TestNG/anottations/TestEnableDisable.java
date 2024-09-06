package anottations;

import org.testng.annotations.Test;

public class TestEnableDisable {
	
	@Test(alwaysRun = true)
	public void testMethod1() {
	    
		System.out.println("This Test will Always Execute");
	}

	@Test(enabled = true)
	public void testMethod2() {
	   
		System.out.println("This Test will Execute");
	}

	@Test(enabled = false)
	public void testMethod3() {
	   
		System.out.println("This test will not Execute");
	} 

}
