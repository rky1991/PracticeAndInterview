package RecursionBasic;

import java.util.Scanner;

public class CalculateSumOfGivenNumber {

		  public static int calculateSumOfNumbers(int n) {
		    // Base case: factorial of 0 is 1
		    if (n == 0) {
		      return 0;
		    }

		    // Recursive case: multiply n with factorial of (n-1)
		    return n + calculateSumOfNumbers(n - 1);
		  }

		  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter Number for Calculate factorial");
			int number = sc.nextInt();
			
		    int sum = calculateSumOfNumbers(number);
		    System.out.println("Sum of " + number + " is: " + sum);
		    
		  }
		


}
