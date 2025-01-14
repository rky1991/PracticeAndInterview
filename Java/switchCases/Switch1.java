package switchCases;

import java.util.Scanner;

public class Switch1 {
	
	public static void main(String[] args) {
		System.out.println("Enter any number between 1 to 7 to find its day");
		Scanner sc = new Scanner(System.in);
		int day=sc.nextInt();
		switch(day)
		{
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today is Wednesday");
			break;
		case 4:
			System.out.println("Today is Thursday");
			break;
		case 5:
			System.out.println("Today is Friday");
			break;
		case 6:
			System.out.println("Today is Saturday");
			break;
		case 7:
			System.out.println("Today is Sunday");
			break;
		default:
			System.out.println("Number is not matched with any of the day");
		}
		
	}

}
