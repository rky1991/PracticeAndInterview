package StringMediumLavelProgram;

public class AllPossiblePalindromicSubstrings {
    public static void main(String[] args) {
        String str = "madam";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substr = str.substring(i, j);
                if (isPalindrome(substr)) {
                    System.out.println(substr);
                }
            }
        }
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
