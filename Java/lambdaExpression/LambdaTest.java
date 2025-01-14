package lambdaExpression;

interface SumCalculator {
    int calSum(int a, int b);
}

//Main.java
public class LambdaTest {

	public static void main(String[] args) {
		SumCalculator sum = (x, y) -> x + y;
		int result = sum.calSum(7, 6);
		System.out.println("Sum 7,6): " + result);
		result = sum.calSum(15, -35);
		System.out.println("Sum 15, -35): " + result);
	}
}
