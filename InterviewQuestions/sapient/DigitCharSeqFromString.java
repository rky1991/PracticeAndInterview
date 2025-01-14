package sapient;

public class DigitCharSeqFromString {
    public static void main(String[] args) {
        String input = "HFD4DYU123INJ7HKG";
        
        // Step 1: Extract the numbers using a regular expression
       String st =input.replaceAll("[^0-9]", " ");
       System.out.println("string --->>"+st);
       String[] numbers = st.trim().split("\\s+");

        // Step 2: Convert the numbers to integers and calculate the sum
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        
        // Step 3: Print the output
        System.out.println(sum); // Output will be 134
    }
}
/***
replaceAll("[^0-9]", " "): This removes all non-numeric characters from the string and replaces them with spaces.
trim(): Trims any leading or trailing spaces.
split("\\s+"): Splits the string based on spaces, which separates the numbers.
 */
