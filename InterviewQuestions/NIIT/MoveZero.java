package NIIT;

import java.util.Arrays;

public class MoveZero {
	
	public static void main(String[] args) {
		
		int fullArray[]= {2,0,5,0,4,0,8,0};
		
		for (int i = 0; i <fullArray.length; i++) {
			
	        if (fullArray[i] == 0 && i > 0) {

	            int temp = fullArray[i - 1];
	            if (temp != 0) {
	                fullArray[i - 1] = 0;
	                fullArray[i] = temp;
	                
	                i = -1;

	            }

	        }

	    }
	    System.out.println(Arrays.toString(fullArray));
	}

}
