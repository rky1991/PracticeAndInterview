
package ConversionOfCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListToTreeSet {
	
	public static void main(String[] args) {
		
		List<String> list= new ArrayList<String>();
		list.add("Rahul");
		//list.add(1);
		list.add("Rahu");
		//list.add(4);
		list.add("Raul");
		//list.add(12);
		list.add("W");
		System.out.println(list);
		//list.add(2,"TY");
		System.out.println(list);
		System.out.println(list.contains("Rul"));
		
		// Traers Using For Each 
		Set<String> st = new HashSet<String>();
		for (String s : list) {
			System.out.println(st.add(s));
		}
		System.out.println("Array List after convert to Set -->"+st);
		
		// Teverse Using itrator
		Iterator it = st.iterator();
		while(it.hasNext()) {
			System.out.println("Set Print Using Itrator -->"+it.next() + " ");
		}
		
		//TreeSet can add only homogenius elements
		Set<String> set1 = new TreeSet<String> (list);
		System.out.println("Array List convert to Tree Set -->"+set1); // Order is not maintained
		for (String s : set1) {
			System.out.println(s);
		}

		
	}

}
