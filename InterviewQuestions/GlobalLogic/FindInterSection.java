package GlobalLogic;

import java.util.HashSet;
import java.util.Set;

public class FindInterSection {
	
	public static void main(String[] args) {
		
		int ar[]={2,5,3,7};
		int ar1[]={5,2,9,0,1};
		
		Set set = new HashSet<>();
		
		for(int s:ar1) {
			set.add(s);
		}
		for(int s: ar) {
			
			if(set.add(s)==false) {
				System.out.println(s);
			}
		}
		
		
		
		
	}

}
