package Capgmini;

public class ReverseStringWithSpecialChars {

    public static String reverseString(String input) {
        // Create a StringBuilder to store only alphanumeric characters in reverse order
        StringBuilder alphanumeric = new StringBuilder();

        // Collect all alphanumeric characters
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                alphanumeric.append(c);
            }
        }

        // Reverse the collected alphanumeric characters
        alphanumeric.reverse();

        // Build the final result by replacing alphanumeric characters in the original string
        StringBuilder result = new StringBuilder();
        int alphaIndex = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                // Replace with reversed character
                result.append(alphanumeric.charAt(alphaIndex++));
            } else {
                // Keep special character in its original position
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "a,b$c";
        String output = reverseString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
