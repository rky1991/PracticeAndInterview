package StringMediumLavelProgram;

public class StringRotation {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "dabc";
        if (str1.length() == str2.length() && (str1 + str1).contains(str2)) {
            System.out.println("Yes, str2 is a rotation of str1");
        } else {
            System.out.println("No, str2 is not a rotation of str1");
        }
    }
}
