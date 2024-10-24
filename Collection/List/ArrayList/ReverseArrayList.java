package List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> ls= new ArrayList<>(5);
		ls.add(2);
		ls.add(5);
		ls.add(4);
		ls.add(7);
		ls.add(6);
		System.out.println(ls);
		Collections.reverse(ls);
		System.out.println(ls);
		
		Collections.sort(ls);
		System.out.println(ls);
		Collections.synchronizedList(ls);
		System.out.println(ls);
		
	}
	
}
