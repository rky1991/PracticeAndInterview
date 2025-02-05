package sapient;
import java.util.Scanner;

public class MinMaxLengthWords {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the sentence
	        System.out.println("Enter a sentence:");
	        String input = scanner.nextLine().trim();

	        // Split the sentence into words
	        String[] words = input.split("\\s+");

	        // Initialize variables to track the minimum and maximum length words
	        String minWord = words[0];
	        String maxWord = words[0];

	        // Iterate through the words to find the minimum and maximum length words
	        for (String word : words) {
	            if (word.length() < minWord.length()) {
	                minWord = word;
	            }
	            if (word.length() > maxWord.length()) {
	                maxWord = word;
	            }
	        }

	        // Output the results
	        System.out.println("Minimum length word: " + minWord);
	        System.out.println("Maximum length word: " + maxWord);

	        scanner.close();
	    }
	


}
