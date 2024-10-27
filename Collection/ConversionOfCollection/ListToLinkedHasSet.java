package ConversionOfCollection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListToLinkedHasSet {
	
public static void main(String[] args) {
		
		List list= new ArrayList();
		list.add("Rahul");
		list.add(1);
		list.add("Rahu");
		list.add(4);
		list.add("Raul");
		list.add(12);
		list.add("W");
		System.out.println(list);
		list.add(2,"TY");
		System.out.println(list);
		System.out.println(list.contains("Rul"));
		
		//TreeSet can add only HetroGenious elements
		Set set1 = new LinkedHashSet(list);
		System.out.println("Array List convert to Tree Set -->"+set1); // Order is maintained
		

		
	}


}
