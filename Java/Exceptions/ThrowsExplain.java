package Exceptions;

public class ThrowsExplain {
	
public static void main(String[] args) {
		
		try {
		int i =10/0; //ArithmeticException statement
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Eception Catched -->"+e);
			System.out.println("Catch Block can not come after finally block");
		}
		finally {
			
			System.out.println("Finaly Block will always execute eiter Exception come or not");
			
		}
		
		
		System.out.println("Hello"); // will not execute
		
	}

}
