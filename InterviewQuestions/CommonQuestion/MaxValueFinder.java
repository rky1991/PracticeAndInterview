package CommonQuestion;

public class MaxValueFinder {
	
	
	/**
     * Finds and returns the maximum value in the given integer array.
     *
     * @param arr The input integer array
     * @return The maximum value in the array
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static int findMaxValue(int[] arr) {
        //If block for null array
    	if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        int max = arr[0]; // Initialize max with the first element
        for (int num : arr) {
        	System.out.println(max+ "<->" +num);
            if (num > max) {
                max = num; // Update max if a larger value is found
            }
        }
        return max;
    }
	
    public static void main(String[] args) {
        // Example array
        int[] numbers = {12, 45, 7, 89, 23, 56};
        
        // Find and print the maximum value
        int maxValue = findMaxValue(numbers);
        System.out.println("The maximum value is: " + maxValue);
    }

    
}