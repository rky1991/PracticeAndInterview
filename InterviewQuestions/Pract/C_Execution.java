package Pract;

public class C_Execution {
	
	public static void main(String[] args) {
		
		A ob = new A();
		ob.test();
		ob.testStatic();
		A.testStatic();
		
		B ob1 = new B();
		ob1.test();
		ob1.testStatic();
		B.testStatic();
		
		A ob2 = new B();
		ob2.test();
		ob2.testStatic();
			
		
	}

}
