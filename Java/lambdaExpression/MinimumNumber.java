package lambdaExpression;

import java.util.Arrays;
import java.util.List;
 
public class MinimumNumber{
	public static void main(String[] args)
	{
		List<Integer> numb = Arrays.asList(13, 21, 78, 3, 35, 8, 10, 23);
 
		int minNum = numb.stream().min(Integer::compare).orElse(0);
 
		System.out.println("Minimum Value : " + minNum);
	}
}