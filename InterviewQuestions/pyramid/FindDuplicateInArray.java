package pyramid;

public class FindDuplicateInArray {
	
	public static void main(String[] args) {
		
		// initilize and declare an array
		int ar[]= new int [] {2,2,4,3,4,6};
		
		for(int i=0;i<ar.length;i++) {
			
			for(int j=i+1;j<ar.length;j++) {
				
				if(ar[i]==ar[j]) {
					
				System.out.println(ar[i] + " <--> "+ar[j]);
					
				}
				
			}
			
		}
	}

}
