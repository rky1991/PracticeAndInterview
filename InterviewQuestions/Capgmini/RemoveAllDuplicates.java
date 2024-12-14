package Capgmini;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveAllDuplicates {
	
	    public static String removeDuplicates(String input) {
	        // Create a LinkedHashMap to store the characters and their counts
	        Map<Character, Integer> map = new LinkedHashMap<>();

	        // Count occurrences of each character
	        for (char c : input.toCharArray()) {
	        	map.put(c, map.getOrDefault(c, 0) + 1);
	        }

	        // Build the result string excluding characters that appear more than once
	        StringBuilder result = new StringBuilder();
	        for (char c : input.toCharArray()) {
	            if (map.get(c) == 1) {
	                result.append(c);
	            }
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        String input = "hlello";
	        String output = removeDuplicates(input);
	        System.out.println("Input: " + input);
	        System.out.println("Output: " + output);
	    }
	}


