package interviewprograms;

public class BblShort {
	
	public static void sortArr(int ar[]) {
		int size = ar.length;
		
		System.out.println("array size"+size);
		int temp;
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-1;j++) {
				if(ar[j]>ar[j+1]) {
					temp= ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}}
	}
	
	public static void main(String[] args) {
		int arr[]= {440,29,16,1,29,10};
		
		sortArr(arr);
		
		System.out.println("printing Array");
		
		for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		
		System.out.println();
		System.out.println("2nd largest Element : "+arr[arr.length-2]);
	}	
	

}
