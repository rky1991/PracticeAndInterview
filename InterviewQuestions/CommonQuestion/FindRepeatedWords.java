package CommonQuestion;

import java.util.HashMap;
import java.util.Map;

public class FindRepeatedWords {
	
	/**
     * Finds and prints the repeated words in a sentence.
     *
     * @param sentence The input sentence
     */
    public static void findRepeatedWords(String sentence) {
   
        // Split the sentence into words
        String[] words = sentence.toLowerCase().split("\\s+");

        // Use a HashMap to count occurrences of each word
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
        	map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);

        // Print repeated words
        System.out.println("Repeated words:");
        boolean hasRepeatedWords = false;
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
                hasRepeatedWords = true;
            }
        }

        if (!hasRepeatedWords) {
            System.out.println("No repeated words found.");
        }
    }
	
	
    public static void main(String[] args) {
        // Example sentence
        String sentence = "This is a test sentence where test is repeated and repeated again";

        // Find and print repeated words
        findRepeatedWords(sentence);
    }

    
}
