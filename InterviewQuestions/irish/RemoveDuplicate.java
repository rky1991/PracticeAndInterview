package irish;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class RemoveDuplicate {
	
	public static void main(String[] args) {
		// Convert String to Char Array 
		//Add that array into LinkedHashSet to remove duplicates and it preserve Order.
		
		String st="java is opps language";
		char[] ch=st.toCharArray();
		Set hs= new LinkedHashSet();
		// add ch array characters in to LinkedHashSet
		for(char c: ch) {
			hs.add(c);
		}
		System.out.println(hs);
		
	}

}
