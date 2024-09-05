package anottations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**  Output Of Order
Befor Suite Section
Befor Test Section
Befor Class Section
Befor Method Section
-->>>>>This is test Method<<<<<<-----
after Method Section
after Class Section
after Test Section
PASSED: testAnnotation

after Suite Section
**/

public class ExecutionOrderOfAnnotation {
	@BeforeSuite
	public void beforSuite() {
		System.out.println("Before Suite Section");
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Before Class Section");
	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Before Test Section");
		
	}
   
	@BeforeMethod
   public void beforeMethod() {
		
		System.out.println("Before Method Section");
		
	}
	
	@Test
	public void testAnnotation() {
		
		System.out.println("-->>>>>This is test Method<<<<<<-----");
		
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after Suite Section");
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("after Class Section");
	}
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("after Test Section");
		
	}
   
	@AfterMethod
   public void afterMethod() {
		
		System.out.println("after Method Section");
		
	}

}
