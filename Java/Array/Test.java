package Array;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		
		int a[] = new int[3]; //
		a[0]=10;
		a[1]=11;
		a[2]=12;
		
		System.out.println("Size of Array ->>"+a.length);
		System.out.println(a); // Object of array
		System.out.println("Array values -->"+Arrays.toString(a));
		for(int i : a) {
			System.out.println("Values of array->>"+i);
		}
	}

}
