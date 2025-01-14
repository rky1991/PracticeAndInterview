package Capgmini;

public class CharCount {
    public static void main(String[] args) {
        String input = "hello world";
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count occurrences using a for loop
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != ' ') { // Skip spaces or handle them as needed
                charCount[c]++;
            }
        }

        // Print character counts
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] >0) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }
    }
}