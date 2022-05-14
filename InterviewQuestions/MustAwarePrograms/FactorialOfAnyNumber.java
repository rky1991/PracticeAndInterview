package MustAwarePrograms;

import java.util.Scanner;

public class FactorialOfAnyNumber {
	
	static int num =5;
	static int fact =1;
	
	
 public static int factorialOfGivenNum(int number) {
		
	 for (int i=1;i<=number;i++) {
			fact = fact*i;
			
		}
		return fact;
	}
 
 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter Number for Find the Factorial :");
	 num=sc.nextInt();
	 System.out.println("Entered Number is : -->"+num);
	 
     System.out.println("Factorial of ->"+num+" is ->"+factorialOfGivenNum(num));
		
	}

}
