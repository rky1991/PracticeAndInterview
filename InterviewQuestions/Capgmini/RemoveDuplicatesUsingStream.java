package Capgmini;

import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicatesUsingStream {
    public static String removeDuplicates(String input) {
        // Count occurrences of each character
        var charFrequency = input.chars()
                                 .boxed()
                                 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Filter characters that appear only once
        return input.chars()
                    .filter(c -> charFrequency.get(c) == 1)
                    .mapToObj(c -> String.valueOf((char) c))
                    .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String input = "hello";
        String output = removeDuplicates(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}