package Conditional_turnary;

import java.util.Scanner;

public class CheckNumberIsPositive {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		// using turnary -->
		 Object res = num > 0 ? "positive" : "negative" ;
		 System.out.println(res);
		
				
	}

}
