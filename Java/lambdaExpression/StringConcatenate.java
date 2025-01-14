package lambdaExpression;

import java.util.function.BiFunction;

public class StringConcatenate{
	
	public static void main(String[] args)
	{
		String str1 = "Tutor Joe's";
		String str2 = "Computer Education";
 
		BiFunction<String, String, String> concatenate = (s1, s2) -> s1 + " " + s2;
 
		String str_con = concatenate.apply(str1, str2);
 
		System.out.println("Concatenated String : " + str_con);
	}
}