package Array;

public class SumOfAllArrayElements {
	
		
		public static void main(String[] args) {
		int result=1;
		int ar[] = {2,4,6,7};
		for(int i=0; i<ar.length; i++) {
			 
			 result = ar[i]*result;
			
		}
		System.out.println(" Sum of array -->"+result);

}
		
}
