package Array;

// two ways to initilize Array 
public class ArrayIntilization {
	
	public static void main(String[] args) {
		
		int a[] = new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		System.out.println("Size of an Array :"+a.length);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int x : a) {
			System.out.println("Value of Array a -->"+x);
			
		}
	}

}
