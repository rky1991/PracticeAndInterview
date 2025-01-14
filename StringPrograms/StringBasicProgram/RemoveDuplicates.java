package StringBasicProgram;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (result.indexOf(String.valueOf(str.charAt(i))) == -1) {
                result.append(str.charAt(i));
            }
        }
        System.out.println("String without duplicates: " + result.toString());
    }
}
