package lambdaExpression;
import java.util.Arrays;
import java.util.List;
 
public class SumOfEvenNumber {
	
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
 
		int even_sum = numbers.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
 
		System.out.println("Sum of Even Numbers : " + even_sum);
	}
}