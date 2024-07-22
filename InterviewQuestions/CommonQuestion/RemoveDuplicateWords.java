package CommonQuestion;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
	
	public static void main(String[] args) {
		String st = "Rahul is Good Man Man He is doing Good in Life";
		String[] wordsSplit = st.split(" ");
		Set set = new LinkedHashSet ();
		
		for(String s:wordsSplit) {
			if(set.add(s)==false) {
				System.out.println("duplicate Word :"+s);
			}
			
		}
		System.out.println("String After Remove Duplicates :"+ set);
		
	}

}
