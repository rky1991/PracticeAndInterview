package anottations;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void testMethod1() {
		System.out.println("First test Method  ");
	}
	
	@Test(dependsOnMethods = "testMethod1")
	public void testMethod2() {
		System.out.println("Second  test Method  ");
	}

}
