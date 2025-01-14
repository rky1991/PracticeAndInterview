package RegularExpressionAndOperation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RejexCharNot {
	
	
	public static void main(String[] args) {
		String st = "[^abc]"; // not abc
		
		Pattern pt = Pattern.compile(st);
		Matcher mt = pt.matcher("d");
		
		if(mt.matches()) {
			System.out.println("Matched ");
		}
		else
			System.out.println("Not Matched");
		
	
	}

}
