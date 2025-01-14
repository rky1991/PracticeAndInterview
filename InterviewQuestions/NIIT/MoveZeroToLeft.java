package NIIT;

import java.util.Arrays;

public class MoveZeroToLeft {
	
	public static void main(String[] args) {
		int ar[]= {2,0,5,0,4,0,8,0};
	    int n = ar.length;
		int a[] = new int[n];
		int counter=0;
		
		//Put Zero to all index of array a[]
		for(int i=0;i<n;i++) {
			if(ar[i]==0) {
				a[counter++]=0;
			}
			System.out.println("Zero left shift -->"+a[i]+ " at Index->"+i);
			System.out.println("Counter -->>"+counter);
			
		}
		
		//Put all non zeros to right side
		for (int i=0;i<n;i++) {
			if(ar[i]!=0){
				a[counter++]=ar[i];
				
			}
			System.out.println("Counter -->>"+counter);
			System.out.println("Non Zero Right Shift shift -->"+a[i]+ " at Index->"+i);
			
		}
		
		
		System.out.println("Zero left shift -->"+Arrays.toString(a));
			
		
	}

}
