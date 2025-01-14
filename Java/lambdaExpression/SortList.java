package lambdaExpression;

import java.util.Arrays;
import java.util.List;
 
public class SortList{
	
	public static void main(String[] args)
	{
		List<String> str = Arrays.asList("Mango", "Cherry", "Apple", "Banana");
		System.out.println("Original Strings : " + str);
 
		str.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
 
		System.out.println("Sorted Strings : " + str);
	}
}