package Bold;

public class Array {
	
	
	
	public boolean test(int arr[],int k, int x) {
		boolean check=false;
		for(int j=0;j<x;j++) {
			if(arr[j]==k) {
				System.out.println("Found : -->"+arr[j]);
				
			}else {
				System.out.println("Not Match with Key : ");
			}
			if(j%3==0) {
				System.out.println("***Segment***");
				x=x+4;
			}
		}
		return check;
	}
	public static void main(String[] args) {
		
		int arr[]= {3,2,4,5,9,8,51,12,43,5,3,7};
		int k=3;
		int x=4;
		Array ob = new Array();
		boolean value = ob.test(arr, k, x);
		System.out.println(value);		
	}

}
