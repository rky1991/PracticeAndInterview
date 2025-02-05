package sapient;

public class MissingNumberFinder {

	/**
	 * Explanation The sum of the first n natural numbers is given by the formula:
	 * 
	 * Sum = 𝑛 × ( 𝑛 + 1 )/2;​
	 * 
	 * The missing number can be calculated by subtracting the sum of the elements
	 * in the array from the expected sum.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// Example array (missing number is 4)
		int[] array = { 1, 2, 3, 5 };

		// Find the missing number
		int n = array.length + 1; // Total numbers including the missing one
		int missingNumber = findMissingNumber(array, n);

		// Output the result
		System.out.println("The missing number is: " + missingNumber);
	}

	public static int findMissingNumber(int[] array, int n) {
		// Calculate the expected sum of numbers from 1 to n
		int expectedSum = n * (n + 1) / 2;

		// Calculate the actual sum of the elements in the array
		int actualSum = 0;
		for (int num : array) {
			actualSum += num;
		}

		// The missing number is the difference
		return expectedSum - actualSum;
	}
}
