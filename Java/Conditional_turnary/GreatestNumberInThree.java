package Conditional_turnary;

import java.util.Scanner;

public class GreatestNumberInThree {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int x =sc.nextInt();
		System.out.println("Enter Second Number");
		int y =sc.nextInt();
		System.out.println("Enter Third Number");
		int z =sc.nextInt();
		
		int largest = z > (x > y ? x : y) ? z : ((x > y) ? x : y);
		
		System.out.println("Greatest Numbaer is : "+largest);
    

}
	
}
