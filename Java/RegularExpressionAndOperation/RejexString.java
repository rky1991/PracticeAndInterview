package RegularExpressionAndOperation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RejexString {
	
	
	public static void main(String[] args) {
		String st = "Hello World";
		
		Pattern pt = Pattern.compile(st);
		Matcher mt = pt.matcher("Hello World");
		
		if(mt.matches()) {
			System.out.println("Matched ");
		}
		else
			System.out.println("Not Matched");
		
	
	}

}
