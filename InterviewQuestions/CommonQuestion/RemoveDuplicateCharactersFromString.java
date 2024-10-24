package CommonQuestion;

import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharactersFromString {
	
	public static void main(String[] args) {
		
		String st= "RRaahhull KKuumaarrrr";
		char[] arr = st.toCharArray();
		
		// Maintain Insetion order
		Set set = new LinkedHashSet<>();
		
		for(char c:arr) {
			if(set.add(c)==false);
		}
		System.out.println("String After Remove Duplicates :"+ set);
		
	}

}
