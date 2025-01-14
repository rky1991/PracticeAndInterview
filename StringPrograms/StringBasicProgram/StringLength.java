package StringBasicProgram;

public class StringLength {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Length of the string is: " + length);
        }
    }
}
