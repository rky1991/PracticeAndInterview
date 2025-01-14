package StringMediumLavelProgram;

//Implement basic string compression using the counts of repeated characters. For example, the string "aabcccccaaa" would become "a2b1c5a3". If the compressed string is not smaller than the original, return the original string.

public class StringCompression {
	
    public static void main(String[] args) {
        String str = "aabcccccaaa";
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        compressed.append(str.charAt(str.length() - 1)).append(count);

        System.out.println(compressed.length() < str.length() ? compressed.toString() : str);
    }
}
