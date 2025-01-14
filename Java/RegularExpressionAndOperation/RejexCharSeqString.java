package RegularExpressionAndOperation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RejexCharSeqString{
	
	
	public static void main(String[] args) {
		
		String st= "Hello World";
		
		String ch = "[a-z]+";
		
		Pattern pt = Pattern.compile(ch);
		Matcher mt = pt.matcher(st);
		
		while(mt.find()) {
			int start = mt.start();
			int end=mt.end();
			System.out.println(start +" <-> "+end);
			System.out.println(st.substring(start,end));
		}
		
		
		
		
	
	}

}
