package interfaces;
import interfaces.ClassInsideInterface.*;

public class ClassExec extends InsideInterface implements ClassInsideInterface{
	
	
	public static void main(String[] args) {
		System.out.println(" implementing class ");
		ClassExec ob = new ClassExec();
		ob.test();
		InsideInterface ob1 = new InsideInterface();
		ob1.test2();
		
	}

	@Override
	public void test() {
		System.out.println("interface abstract method ");
	}

}
