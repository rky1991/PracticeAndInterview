package anottations;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups = {"Smoke","Regression","Sanity"})
	public void testMethod1() {
	    
		System.out.println("Test Method 1");
	}

	@Test(groups = "Smoke")
	public void testMethod2() {
	   
		System.out.println("Test Method 2");
	}

	@Test(groups = {"Regression" , "Sanity"})
	public void testMethod3() {
	   
		System.out.println("Test Method 3");
	} 

}
