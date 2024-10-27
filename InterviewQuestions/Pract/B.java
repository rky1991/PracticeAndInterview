package Pract;

public class B extends A {
	
	// In child class we can not lowered the visiblity , here we can not make test method as private.
//	private void test() {
//		System.out.println("I am from Class 'B' :");
//		System.out.println("I am from Class 'B' :");
//	}
	
	public void test() {
		System.out.println("I am from Class 'B' :");
	}
	
	// Static method can not override & method hiding
	public static void testStatic() {
		System.out.println("I am Static from Class 'B' :");
		
	}

}
