package StringMediumLavelProgram;

public class VerifyStringPelindrome {
	
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
	
	public static void main(String[] args) {
		String s = "madam";
		boolean res = isPalindrome(s);
		System.out.println(res);
	}


}
