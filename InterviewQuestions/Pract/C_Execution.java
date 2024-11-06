package Pract;

public class C_Execution {
	
	public static void main(String[] args) {
		
		A ob = new A(); //Class A Obj creation and ref variable
		ob.test();
		ob.testStatic();
		A.testStatic();
		
		B ob1 = new B(); //Class B Obj creation and ref variable
		ob1.test();
		ob1.testStatic();
		B.testStatic();
		
		A ob2 = new B(); //Class B Obj creation and Class A ref variable
		ob2.test();
		ob2.testStatic();
			
		
	}

}
