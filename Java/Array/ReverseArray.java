package Array;

import java.util.Arrays;
import java.util.Scanner;


// Reverse An array :- Take one array store value ,take another array change index
public class ReverseArray {
	
	public static void main(String[] args) {
		int a[]= new int[3];
		
		//int rev[]=new int[a.length];
		//int b[]= {a.length};
		
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter value in the array at index :"+i);
			a[i]=scan.nextInt();
			System.out.println("Stored Value in Array is:"+a[i]);
		}
		System.out.println("** Array is full you have done :**");
		System.out.println(Arrays.toString(a));
		System.out.println("** Reverse an Array is start**");
		
		for(int j=a.length-1;j>=0;j--) {
			System.out.println(a[j]);
		}
		
	}

}
