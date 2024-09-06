package anottations;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeMethodAndBeforeTest {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Each test Method  ");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before the entire test Suite ");
	}
	
	
	@Test
	public void testMethod1() {
		System.out.println("First test Method  ");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Second  test Method  ");
	}

}
