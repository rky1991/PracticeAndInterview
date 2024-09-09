package anottations;

import org.testng.annotations.Test;

public class PeriortyInTestNG {
	
	@Test(priority = 1)
	public void highPriorityTest() {
	    // High priority test logic
		System.out.println("High priority test logic");
	}

	@Test(priority = 2)
	public void mediumPriorityTest() {
	    // Medium priority test logic
		System.out.println("Medium priority test logic");
	}

	@Test(priority = 3)
	public void lowPriorityTest() {
	    // Low priority test logic
		System.out.println("Low priority test logic");
	} 

}
