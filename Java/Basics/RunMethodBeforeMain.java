package Basics;

public class RunMethodBeforeMain {
	
	public static void main(String[] args) {
		
		System.out.println("Main Method Begins : ");
		System.out.println(a);
		System.out.println("Main Method Ends");
		
	}
	
	public static int test() {
		System.out.println("Test Method Begins : ");
		a=10;
		System.out.println("Test Ends  :");
		return 20;
		
	}
	static int a= test();

}
