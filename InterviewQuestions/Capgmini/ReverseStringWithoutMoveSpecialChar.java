package Capgmini;

public class ReverseStringWithoutMoveSpecialChar {
	
	    public static String reverseString(String input) {
	        // Convert the input string to a character array
	        char[] chars = input.toCharArray();
	        
	        // Initialize two pointers: one at the start, one at the end
	        int left = 0, right = chars.length - 1;

	        // Traverse the string
	        while (left < right) {
	            // Skip special characters
	            if (!Character.isLetterOrDigit(chars[left])) {
	                left++;
	            } else if (!Character.isLetterOrDigit(chars[right])) {
	                right--;
	            } else {
	                // Swap the characters
	                char temp = chars[left];
	                chars[left] = chars[right];
	                chars[right] = temp;

	                // Move both pointers
	                left++;
	                right--;
	            }
	        }
	        
	        return new String(chars);
	    }

	    public static void main(String[] args) {
	        String input = "a,dsa$%b$cdf";
	        String output = reverseString(input);
	        System.out.println("Input: " + input);
	        System.out.println("Output: " + output);
	    }
	}

