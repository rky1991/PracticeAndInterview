package Comparator;

import java.util.Comparator;

public class SortItem implements Comparator<DateItem> {

	
	 // Returning the value after comparing the objects
    
	@Override
	public int compare(DateItem a, DateItem b) {
		
		System.out.println("comparing two Objects : : ");
	
		return a.date.compareTo(b.date);// this will sort the data in Ascending order 
//	 return b.date.compareTo(a.date);// this will sort the data in decending order
		
		
	}
	
	

}
