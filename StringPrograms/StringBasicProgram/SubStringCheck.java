package StringBasicProgram;

public class SubStringCheck {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String substring = "World";
        if (str.contains(substring)) {
            System.out.println("The string contains the substring.");
        } else {
            System.out.println("The string does not contain the substring.");
        }
    }
}
