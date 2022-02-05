package NIIT;

import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		int ar[]= {1,2,2,3,21,32,3,32,1,2,21,54,54,33,23,23,};
		
		Set set= new HashSet<>();
		
		for(int a1:ar) {
			
			if(set.add(a1)==false) {
				System.out.println("duplicate Objects :"+a1);
			}
		}
		System.out.println("After Remove Duplicate From Array :"+set);
		
	}

}
