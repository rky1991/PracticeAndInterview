package lambdaExpression;

public class Palindrome
{
	public static void main(String[] args)
	{
		StringChecker isPalindromeLambda = str -> {
			String cleanedStr = str.replaceAll("\\s", "").toLowerCase();
			return cleanedStr.equals(new StringBuilder(cleanedStr).reverse().toString());
		};
 
		System.out.println("rotator is Palindrome : "+isPalindromeLambda.check("rotator"));
		System.out.println("world is Palindrome : "+isPalindromeLambda.check("world"));
	}
}
 
interface StringChecker
{
	boolean check(String str);
}