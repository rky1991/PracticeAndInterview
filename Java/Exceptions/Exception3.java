package Exceptions;


public class Exception3 {
	
	public void test()  throws ClassNotFoundException{
		System.out.println("Test thwows ");
		
		
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException  {
		
		//Exception3 ob= new Exception3();
		
		Class.forName("java.util.scanner");

			//ob.test();
		
		
		
		System.out.println("Hello Dhruv");
		
	}

}
