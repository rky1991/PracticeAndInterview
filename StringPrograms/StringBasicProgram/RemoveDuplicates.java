package StringBasicProgram;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
        	String ch = String.valueOf(str.charAt(i));
        	//result.indexOf(ch) --> Return -1 if char not matched
            if (result.indexOf(ch) == -1) {
                result.append(str.charAt(i));
            }
        }
        System.out.println("String without duplicates: " + result.toString());
    }
}
