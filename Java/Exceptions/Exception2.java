package Exceptions;

public class Exception2 {
	
	public static void main(String[] args) {
		
		try {
		int i =10/0; //ArithmeticException
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Eception Catched -->"+e);
		}
		System.out.println("Hello"); // will not execute
		
	}

}
