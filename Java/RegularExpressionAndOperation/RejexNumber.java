package RegularExpressionAndOperation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RejexNumber {
	
	
	public static void main(String[] args) {
		String st = "[0-9]";
		
		Pattern pt = Pattern.compile(st);
		Matcher mt = pt.matcher("1");
		
		if(mt.matches()) {
			System.out.println("Matched ");
		}
		else
			System.out.println("Not Matched");
		
	
	}

}
