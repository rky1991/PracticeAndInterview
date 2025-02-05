package Exceptions;


public class Exception2 {
	
	public void test()  throws ArithmeticException{
		System.out.println("Test thwows ");
		int i =10/0;
		
		
	}
	
	public static void main(String[] args)  {
		
		Exception2 ob= new Exception2();
		try {
			ob.test();
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}
		
		
		System.out.println("Hello Dhruv");
		
	}

}
