package recursion;

public class Recurssion3 {
	
	static void test(int i) {
		i++;
		System.out.println(i);// Before recursion 
		if (i==5) {
			return;
		}
		test(i); // Recurssion call
		System.out.println(i);// After Recurssion
	}
	
	public static void main(String[] args) {
		System.out.println("Main Started ");
		test(0);
		System.out.println("Main Ended ");
	}

}
