package Array;

import java.util.Arrays;

//Take Array 'A' add some element , Copy those Element in array 'B' in reverse order

public class ChangeArrayInReverseOrder {
	
	public static void main(String[] args) {
		int a[]= {10,20,30};
		int size=a.length;
		int b[]= new int[size];
		
		for(int i=0;i<size;i++) {
			b[i]=a[size-i-1];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
	}

}
