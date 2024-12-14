package Capgmini;

public class RemoveConsecutiveDuplicates {

    public static String removeDuplicates(String input) {
        // StringBuilder for efficient string manipulation
        StringBuilder result = new StringBuilder();
        
        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            // Add the first character or any character that's different from the previous one
            if (i == 0 || input.charAt(i) != input.charAt(i - 1)) {
                result.append(input.charAt(i));
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        // Input string
        String input = "hello";

        // Process the input and print the result
        String output = removeDuplicates(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
