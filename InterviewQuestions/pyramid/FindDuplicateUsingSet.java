package pyramid;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateUsingSet {
	
	
	public static void main(String[] args) {
		
		int ar[]= {2,3,4,3,2,4,5,6,5,1,1};
		
		Set set = new HashSet();
		
		for(int s : ar) {
			if(set.add(s)==false) {
				System.out.println(s);
			}
		}
		// Remove Duplicate from and array
		System.out.println(set);
	}

}
