package Capgmini;

import java.util.Arrays;

public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        // Create an array to count the occurrences of characters
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character
        for (char c : input.toCharArray()) {
            charCount[c]++;
            System.out.println(c);
        }
        //String st ="";
        
     // Print character counts
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println( (char) i + ": " + charCount[i]);
            }
        }

        // Build the result string excluding characters that appear more than once
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (charCount[c] == 1) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        String output = removeDuplicates(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}