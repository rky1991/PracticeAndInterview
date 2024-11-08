package interfaces;

import NAB_Codality.test;

public class TestInterfaceClass implements InterfaceItems{

	public void t1() {
		// TODO Auto-generated method stub
		
		System.out.println("Implemented t1 method");
		
	}
	
	
	public void defalut() {
		// TODO Auto-generated method stub
		System.out.println("Implemented default method");
	}
	
	public static void main(String[] args) {
		TestInterfaceClass ob = new TestInterfaceClass();
		ob.t1();
		ob.defalut();
		InterfaceItems.test();
	}
	


}
