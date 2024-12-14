package Set.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHassetTest {
	
	//Reserve insertion order, will not allow duplicates

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		
		set.add(1);
		set.add(5);
		set.add(10);
		set.add(3);
		set.add(3);
		
		System.out.println(set.contains(3));
		System.out.println(set);
		
		 Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
