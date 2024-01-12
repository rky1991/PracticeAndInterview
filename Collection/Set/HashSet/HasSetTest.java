package Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HasSetTest {
	
	// duplicate not allowed
	//Order is not predictable.
	
	public static void main(String[] args) {
		Set st= new HashSet<>();
		
		st.add(4);
		
		boolean b = st.add(4);// duplicate not allowed
		System.out.println("Duplicate add===>>"+b);
		st.add(5);
		st.add(1);
		st.add(50);
		
		System.out.println(st);
		
	}

}
