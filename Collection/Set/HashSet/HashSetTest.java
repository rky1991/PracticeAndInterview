package Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	
	public static void main(String[] args) {
		Set set=  new HashSet();
		set.add("add");
		set.add(1);
		System.out.println(set.add(false));
		set.add(2.5);
		
		System.out.println(set);
		
		
	}

}
