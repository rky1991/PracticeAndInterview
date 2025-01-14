package lambdaExpression;
import java.util.Arrays;
import java.util.List;
 
public class AverageOfDoubles{
	
	public static void main(String[] args)
	{
		List<Double> num = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
 
		double sum = num.stream().mapToDouble(Double::doubleValue).sum();
 
		double ave = sum / num.size();
 
		System.out.println("Average : " + ave);
	}
}