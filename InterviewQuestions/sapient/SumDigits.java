package sapient;

public class SumDigits {

    // Method to add all digits in a string
    public static int addDigitsOfString(String numberStr) {
        int total = 0;
        
        // Loop through each character in the string
        for (int i = 0; i < numberStr.length(); i++) {
            // Get the character at the current position
            char ch = numberStr.charAt(i);
            
            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Convert the character to an integer and add to total
            	int c = ch - '0';  // Subtracts ASCII value of '0'-> 48 to get the integer value (49-48=1)
                System.out.println(c);
            	total = total + c; 
            }
        }
        
        return total;
    }

    public static void main(String[] args) {
        // Example usage
        String numberStr = "12345";
        int result = addDigitsOfString(numberStr);
        System.out.println("The sum of the digits in '" + numberStr + "' is " + result);
    }
}