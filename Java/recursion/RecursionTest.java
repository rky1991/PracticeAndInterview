package recursion;

public class RecursionTest {
	
	static void test(int i) {
		
		System.out.println(i++); // Before Recurssion
		if(i==2) {
			return; // Throw the control to main method
		}
		test(i);
	}
	
	
	public static void main(String[] args) {
		
		test(0);
	}

}
