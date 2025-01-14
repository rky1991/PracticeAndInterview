package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class StringSortBasedonLength
{
	public static void main(String[] args)
	{
		List<String> strings = new ArrayList<>(List.of("Pineapple", "Apple", "Banana", "Orange", "Raspberries", "Grape", "Blueberry"));
		System.out.println("Given String : "+strings);
		Collections.sort(strings, (s1, s2) -> s1.length() - s2.length());
		System.out.println("Ascending Order : "+strings);
	}
}