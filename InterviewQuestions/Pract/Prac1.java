package Pract;

public class Prac1 {
	
	
	public static void test() {
	try {
		System.exit(1);
	}
	catch(Exception e) {
		e.getStackTrace();
	}
	finally {
		System.out.println("Finally block");
	}

}
	
	public static void main(String[] args) {
		test();

}
}