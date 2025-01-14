package StringMediumLavelProgram;

import java.util.HashMap;

/**
 * Given a string, find the character that appears most frequently. If there are multiple such characters, return the first one encountered.
 */

public class MostFrequentCharacter {
	
    public static void main(String[] args) {
        String str = "aaabbcccddee";
        HashMap<Character, Integer> freqMap = new HashMap<>();
        int maxCount = 0;
        char result = str.charAt(0);

        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            if (freqMap.get(ch) > maxCount) {
                maxCount = freqMap.get(ch);
                result = ch;
            }
        }

        System.out.println("Most frequent character: " + result);
    }
}


