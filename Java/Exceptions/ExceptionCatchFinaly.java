package Exceptions;

public class ExceptionCatchFinaly {
	
	public static void main(String[] args) {
		try {
			System.out.println("Before exception statement ");
			int t = 9/0;
			System.out.println("After exception statement "); // This Statement will not print
		} 
		catch (ArithmeticException e) {
			// TODO: handle exception
			
			System.out.println("catch block Aithrmetic");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch block Exception Class");
		}
		finally{
			
			System.out.println("Finally block");
			
		}
	}

}
