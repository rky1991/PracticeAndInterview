package sapient;

public class ReversePattern {
	
    public static void main(String[] args) {
        String str = "RahulKumar ChandanKumar";

        // Split the string into words
        String[] words = str.split(" ");

        // StringBuilder to hold the final result
        StringBuilder result = new StringBuilder();

        // Process each word
        for (String word : words) {
            if (word.length() > 1) {
                // Reverse the middle part of the word, keeping the first and last characters
                String trimedWord = word.substring(2, 7);
                String reversedMiddle = new StringBuilder(trimedWord).reverse().toString();
                result.append(reversedMiddle + " "); // Reversed middle part
     
            } else {
                // If the word has only one character, keep it as it is
                result.append(word);
            }

        }

        // Convert StringBuilder to String and remove the trailing space
        System.out.println(result.toString().trim());
    }
}