package List.ArrayList;

import java.util.ArrayList;

public class TrimSize {
	
	public static void main(String[] args) {
		
	ArrayList<Integer> ls= new ArrayList<>(5);
	ls.add(2);
	ls.add(3);
	ls.add(4);
	ls.add(5);
	ls.add(6);
	System.out.println(ls);
	ls.add(7);
	ls.add(2);
	ls.add(3);
	ls.add(4);
	ls.add(5);
	ls.add(6);
	System.out.println(ls);
	ls.trimToSize();
	System.out.println("The List elements are:");
	for (Integer number : ls) {
	System.out.println("Number =" + number);
	}
	
	
	}

}
