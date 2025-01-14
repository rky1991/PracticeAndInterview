package StringMediumLavelProgram;

//Given a string, find the length of the longest substring without repeating characters.

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        int left = 0;

        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println("Length of longest substring without repeating characters: " + maxLength);
    }
}

