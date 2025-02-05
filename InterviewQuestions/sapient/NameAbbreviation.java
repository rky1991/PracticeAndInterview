package sapient;

import java.util.Scanner;

public class NameAbbreviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the full name
        System.out.println("Enter the full name:");
        String fullName = scanner.nextLine().trim();

        // Split the name into parts
        String[] nameParts = fullName.split(" ");
        System.out.println(nameParts.length);

        // Initialize a StringBuilder to build the output
        StringBuilder abbreviatedName = new StringBuilder();

        // Process all parts of the name except the last
        for (int i = 0; i < nameParts.length - 1; i++) {
            abbreviatedName.append(nameParts[i].charAt(0)).append(". ");
        }

        // Append the last name
        abbreviatedName.append(nameParts[nameParts.length - 1]);

        // Print the result
        System.out.println("Abbreviated Name: " + abbreviatedName.toString());

        scanner.close();
    }
}
