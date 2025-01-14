package lambdaExpression;

import java.util.Arrays;
import java.util.List;
 
public class SumOfOddNumber{
	
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int odd_sum = numbers.stream().filter(num -> num % 2 == 1).mapToInt(Integer::intValue).sum(); 
		System.out.println("Sum of Odd Numbers : " + odd_sum);
	}
}