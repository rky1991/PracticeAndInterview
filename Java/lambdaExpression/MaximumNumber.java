package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
 
public class MaximumNumber{
	
	public static void main(String[] args)
	{
		List<Integer> num = Arrays.asList(13, 21, 78, 23, 35, 8, 1);
 
		Optional<Integer> maxNum = num.stream().reduce((a, b) -> a > b ? a : b);
 
		if (maxNum.isPresent())
		{
			System.out.println("Maximum Number : " + maxNum.get());
		}
		else
		{
			System.out.println("Numbers Not Found");
		}
	}
}