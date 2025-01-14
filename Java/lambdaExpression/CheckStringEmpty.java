package lambdaExpression;
// Main.java
import java.util.function.Predicate;


public class CheckStringEmpty {
	

	    public static void main(String[] args) {
	       
	    	String inputString = "";
			Predicate<String> isEmpty = str -> str.isEmpty();
			if (isEmpty.test(inputString))
			{
				System.out.println("String is Empty");
			}
			else
			{
				System.out.println("String is Not Empty");
			}
	
	    }

}
