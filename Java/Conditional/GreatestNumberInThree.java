package Conditional;

import java.util.Scanner;

public class GreatestNumberInThree {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a =sc.nextInt();
		System.out.println("Enter Second Number");
		int b =sc.nextInt();
		System.out.println("Enter Third Number");
		int c =sc.nextInt();
		
		//compaare 'a' with b,c
		if(a>b && a>c) {
			System.out.println("First Number is Greatest: "+a);
		}
		//compaare 'b' with a,c
		else if(b>a && b>c) {
			System.out.println("Second Number is Greatest: "+b);
		}
		else {
			System.out.println("Third number is Greatest: "+c);
		}
	}

}
