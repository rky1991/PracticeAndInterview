package StringMediumLavelProgram;


public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "babad";
        String longestPalindrome = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String subStr = str.substring(i, j);
                if (isPalindrome(subStr) && subStr.length() > longestPalindrome.length()) {
                    longestPalindrome = subStr;
                }
            }
        }

        System.out.println("Longest Palindromic Substring: " + longestPalindrome);
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
