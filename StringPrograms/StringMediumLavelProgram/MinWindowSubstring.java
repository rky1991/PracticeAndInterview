package StringMediumLavelProgram;

import java.util.HashMap;
/**
 * Given two strings s and t, find the minimum window in s which will contain all the characters in t. 
 * If no such window exists, return an empty string.
 */

public class MinWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        HashMap<Character, Integer> tMap = new HashMap<>();
        for (char ch : t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }

        int left = 0, right = 0, minLen = Integer.MAX_VALUE, start = 0;
        int requiredChars = tMap.size();
        HashMap<Character, Integer> windowMap = new HashMap<>();

        while (right < s.length()) {
            char chRight = s.charAt(right);
            windowMap.put(chRight, windowMap.getOrDefault(chRight, 0) + 1);

            if (tMap.containsKey(chRight) && windowMap.get(chRight).intValue() == tMap.get(chRight).intValue()) {
                requiredChars--;
            }

            while (requiredChars == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char chLeft = s.charAt(left);
                windowMap.put(chLeft, windowMap.get(chLeft) - 1);

                if (tMap.containsKey(chLeft) && windowMap.get(chLeft).intValue() < tMap.get(chLeft).intValue()) {
                    requiredChars++;
                }
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
