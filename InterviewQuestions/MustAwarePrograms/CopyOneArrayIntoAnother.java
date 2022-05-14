package MustAwarePrograms;

public class CopyOneArrayIntoAnother {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,7};
		int arr2[]= new int[arr.length];
		
		for(int i=0,j=0; i<arr.length; i++,j++) {
			arr2[i]=arr[j];
		}
		
		for(int i =0;i<arr2.length;i++) {
			System.out.println("Values in Arr2[] copied from arr[] "+arr2[i]);
		}
		
		
	}

}
