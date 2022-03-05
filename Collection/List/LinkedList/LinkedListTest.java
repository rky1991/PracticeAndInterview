package List.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
		LinkedList ls = new LinkedList();
		ls.add("RAhul");
		ls.add(2);
		ls.add("RA");
		ls.add(23);
		
		
		System.out.println(ls.getClass());
		ls.addFirst(89);
		ls.addLast(10);
		System.out.println(ls);
	    ls.pop();// remove 1st element
		System.out.println("after pop :"+ls);
		
		ListIterator o = ls.listIterator();
		
		while(o.hasNext()) {
			System.out.println(o.next());
			
		}
		System.out.println(ls);
		
		
		
		
	}

}
