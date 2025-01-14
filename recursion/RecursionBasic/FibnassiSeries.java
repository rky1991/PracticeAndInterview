package RecursionBasic;

import java.util.Scanner;

public class FibnassiSeries {
	
	     public static int fibseries(int n) {
	    	 
	    	// Base Case
	         if (n <= 1)
	             return n;

	         // Recursive call
	         return fibseries(n - 1) + fibseries(n - 2);
	     }

	

		  public static void main(String[] args) {
			int number = 10;
			
			 for (int i = 0; i < number; i++) {

		            System.out.println(fibseries(i) + " ");
		        }
			
//		    int res = fibseries(number);
//		    System.out.println("Factorial of " + number + " is: " + res);
		    
		  }
		


}
