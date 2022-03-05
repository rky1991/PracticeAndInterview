package casting;

public class ExecutionAB {
	
	public static void main(String[] args) {
		UpcastingA oba= new UpacastingB();
		System.out.println("Using Reference Variabe of A Class");
		System.out.println(oba.a +" a and j value "+oba.j);
		oba.test();
		oba.testStatic();
		
		UpacastingB ob= new UpacastingB();
		System.out.println("Using Reference Variabe of B Class");
		System.out.println(ob.a +" a and j "+ob.j);
		ob.testB();
		ob.testStaticB();
		ob.test();//fro A class
		ob.testStatic();// method fro A class
		UpacastingB ob1= (UpacastingB) new UpcastingA();
		System.out.println("Using Reference Variabe of b Class and object of A class");
		System.out.println(ob1.a+"a and j :"+ob1.j);
		ob1.test();
		ob1.testB();
		ob1.testStatic();
		ob1.testStaticB();
		
	}

}
