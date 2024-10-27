package recursion;

public class Recurssion2 {
	
//return inside if block Throw the control to main method but before reach to main method it execute remaining statements of test mrthod
	
	public static void test(int i) {
		i++;
		if(i==4) {
			return; 
		}
		test(i);
		System.out.println(i); // After Recurssion
		
	}
	public static void main(String[] args) {
		
		System.out.println("Main Method Started");
		
		test(0);
		
		System.out.println("Main Method Ended");
	}

}
