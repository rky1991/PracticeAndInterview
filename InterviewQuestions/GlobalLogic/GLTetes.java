package GlobalLogic;

import java.util.*;

public class GLTetes{
	
	
	// Ar1[]={2,5,3,7},Ar2={5,2,9,0,1}
	// {5,2}
	
	
	public static void main(String[] args) {
		
	
		int ar[]={2,5,3,7};
		int ar1[]={5,2,9,0,1};
		int len=0;
		
		int interSection[] = new int[ar1.length];
		ArrayList ls = new ArrayList();
		
		Arrays.sort(ar);
		Arrays.sort(ar1);
		
		System.out.println("Array After Sort ->"+Arrays.toString(ar)+":"+Arrays.toString(ar1));
		System.out.println("Empty Array -->"+Arrays.toString(interSection));
		System.out.println("Empty List  -->"+ls);
		
		// Main Logic
		for(int i=0;i<ar1.length;i++) {	
			for(int j=0;j<ar.length;j++) {
				if(ar1[i]==ar[j]) {
					System.out.println("Added to Intersection List -->"+ar1[i]+" : "+ar[j]);
					ls.add(ar[j]); // Adding to List
					interSection[j]=ar[j];// adding to Array 
				}
			}
		}
		
		System.out.println(ls);
		System.out.println(Arrays.toString(interSection));
		Object[] cht = ls.toArray();
		
	
	}
	
	

	
	

}
