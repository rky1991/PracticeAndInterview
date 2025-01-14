package StringBasicProgram;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        String str = "12345";
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i) - '0';
            System.out.println(ch);
            result = result * 10 + ch;
        }
        System.out.println("Converted integer: " + result);
    }
}
