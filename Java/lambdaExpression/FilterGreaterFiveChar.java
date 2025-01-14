package lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class FilterGreaterFiveChar
{
	public static void main(String[] args)
	{
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig");
		System.out.println("Given String : " + strings);
 
		// Using Lambda Expression to filter out strings with length greater than 5
		List<String> filteredStrings = strings.stream()
				.filter(str -> str.length() <= 5)
				.collect(java.util.stream.Collectors.toList());
 
		// Print the filtered strings
		System.out.println("Strings with length less than or equal to 5 characters:");
		filteredStrings.forEach(System.out::println);
	}
}