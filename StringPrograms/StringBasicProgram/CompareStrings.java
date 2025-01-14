package StringBasicProgram;

public class CompareStrings {
	// Compare two string without equals method --->>>>
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        boolean isEqual = true;

        if (str1.length() != str2.length()) {
            isEqual = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }

        System.out.println("The strings are " + (isEqual ? "equal" : "not equal"));
    }
}
