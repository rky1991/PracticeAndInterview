package Conditional;

import java.util.Scanner;

public class CheckNumberIsPositive {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num>0) {
			System.out.println("Number is Positive");
		}
		else if (num<0) {
			System.out.println("Number is negative");
		}
		else
			System.out.println("Given Number is - 0");
		
	}

}
