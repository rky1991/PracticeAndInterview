package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
 
public class Sum_Multiple
{
	public static void main(String[] args)
	{
		List<Integer> num = new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
 
		int mul = num.stream().reduce(1, (a, b) -> a * b); // Multiply all elements together
 
		System.out.println("Multiplication of Elements : " + mul);
 
		int sum = num.stream().reduce(0, (a, b) -> a + b); // Sum all elements
 
		System.out.println("Sum of Elements : " + sum);
	}
}