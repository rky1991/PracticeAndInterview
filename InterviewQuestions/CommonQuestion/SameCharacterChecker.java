package CommonQuestion;

import java.util.Arrays;

/**
 * Write a method to check whether the strings passed as input parameters are made up of the same set of characters.
 */

public class SameCharacterChecker {
	
	
	/**
     * Checks if two strings are made up of the same set of characters.
     *
     * @param str1 The first input string
     * @param str2 The second input string
     * @return true if both strings are made up of the same set of characters, false otherwise
     */
    public static boolean areSameCharacters(String str1, String str2) {
        // Check for null or empty strings
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        // Compare the sorted arrays
        return Arrays.equals(chars1, chars2);
    }
	
	public static void main(String[] args) {
        // Example inputs
        String str1 = "listen";
        String str2 = "silent";

        boolean result = areSameCharacters(str1, str2);
        System.out.println("Are the strings made up of the same set of characters? " + result);
    }

    
}


