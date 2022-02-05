package Array;

public class ChangeValueInArray {
	
	public static void printArray(int arr[]){
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		int a[]= {10,20,30};
		int size=a.length;
		int b[]=new int[size];
		
		// copy and reverse array from b[] --> b[]
		for(int i=0, j=size-1;i<size;i++,j--) {
			b[j]=a[i];
		}
		printArray(b);
		
		
		
	}

}
