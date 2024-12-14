package Map.HashMap;

import java.util.*;

public class CharCountMethod {
	
	public static void main(String[] args) {
		
		Map<Character ,Integer> mp = new HashMap();
		mp.put('a',4);
		mp.put('b',5);
		mp.put('c',6);
		System.out.println(mp);
		
		// if key is matched it will print its value, if not it will assign default value to key (0) 
		Integer v = mp.getOrDefault('a', 0);
		System.out.println(v);
		
		int t = mp.getOrDefault('d', 0);
		System.out.println(t);
		
		System.out.println(mp.getOrDefault('d', 9));
	}

}
