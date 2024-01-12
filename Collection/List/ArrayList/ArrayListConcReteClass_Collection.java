package List.ArrayList;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListConcReteClass_Collection {
	
	public static void main(String[] args) {
		List list;
		AbstractList absList;
		Collection cl;
		AbstractCollection al = null;
		ArrayList arrayList;
		arrayList = new ArrayList();
		
		//Upcasting arraylist to List
		list = arrayList;
		
		//Upcasting arraylist to abstract List
		absList = arrayList;
		
		//Upcasting arraylist to collection
		cl = arrayList;
		
		//Upcasting arraylist to abstract Collection
		
		//DownCasting collection to Array List
		arrayList = (ArrayList) cl;
		list = (List) al;
		al = (AbstractCollection) list;
		System.out.println("done");
	}

}
