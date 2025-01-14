package StringMediumLavelProgram;

/**
 * Two strings are isomorphic if the characters in one string can be replaced to get the other string.

 */
public class IsomorphicStrings {
    public static void main(String[] args) {
        String str1 = "egg";
        String str2 = "add";
        System.out.println(areIsomorphic(str1, str2));
    }

    public static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        char[] mapping1 = new char[256];
        char[] mapping2 = new char[256];

        for (int i = 0; i < str1.length(); i++) {
            if (mapping1[str1.charAt(i)] != mapping2[str2.charAt(i)]) {
                return false;
            }
            mapping1[str1.charAt(i)] = (char) (i + 1);
            mapping2[str2.charAt(i)] = (char) (i + 1);
        }
        return true;
    }
}
