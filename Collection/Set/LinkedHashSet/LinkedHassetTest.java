package Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHassetTest {

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		
		set.add(1);
		set.add(5);
		set.add(10);
		set.add(3);
		
		System.out.println(set.contains(3));
		
		
	}
}
