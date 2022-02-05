package Set;

import java.util.HashSet;
import java.util.Set;

public class HasSetTest {
	
	// duplicate not allowed
	//Order is not predictable.
	
	public static void main(String[] args) {
		Set st= new HashSet<>();
		
		st.add(4);
		st.add(4);// duplicate not allowed
		st.add(5);
		st.add(1);
		st.add(50);
		
		System.out.println(st);
		
	}

}
