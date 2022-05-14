package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortObjByDate {
	
	public static void main(String[] args) {
		
		ArrayList<DateItem> list= new ArrayList<>();
		
		list.add(new DateItem("2020-03-23"));
		list.add(new DateItem("1989-12-03"));
		list.add(new DateItem("1970-01-02"));
		list.add(new DateItem("1970-01-03"));
		list.add(new DateItem("1970-02-13"));
		list.add(new DateItem("1970-02-03"));
		
		SortItem sortObj= new SortItem();
		Collections.sort(list,sortObj);
		
		System.out.println("Elements in List are sorted in desending Order :-->>");
		for(DateItem d: list) {
			System.out.println("Print Sorted Item -->>"+d.date);
		}
		
		
	}

}
