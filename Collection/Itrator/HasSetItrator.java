package Itrator;

import java.util.*;

public class HasSetItrator {
	
	public static void main(String[] args) {
		
		Set st = new HashSet();
		st.add('a');
		st.add('b');
		st.add('c');
		
		System.out.println(st);
		
		Iterator itr = st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
