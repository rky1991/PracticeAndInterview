package lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class RemoveDuplicate{
	
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 4);
 
		List<Integer> distnum = new ArrayList<>(numbers);
		distnum.removeIf(number -> numbers.indexOf(number) != numbers.lastIndexOf(number));
 
		System.out.println("Original Numbers : " + numbers);
		System.out.println("Distinct Numbers : " + distnum);
	}
}
