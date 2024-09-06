package anottations;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 1)
	public void testMethod1() {
	    
		System.out.println("Test Method 1");
	}

	@Test(invocationCount = 2)
	public void testMethod2() {
	   
		System.out.println("Test Method 2");
	}

	@Test(invocationCount = 3)
	public void testMethod3() {
	   
		System.out.println("Test Method 3");
	} 

}
