package Set.TreeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToTreeSet {
	
	public static void main(String[] args) {
		
     HashSet set = new HashSet();
		
		set.add(1);
		set.add(5);
		set.add(10);
		set.add(3);
		set.add(3);
		System.out.println("Set-No Order-No Duplicate-->>"+set);
		
	    TreeSet st = new TreeSet(set);
	    st.add(5);
	    System.out.println("Ordered/ Sorted set No Duplicate-->>"+st);
	    
		
		
	}

}
