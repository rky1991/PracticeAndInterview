package Map.HashMap;

import java.util.*;

public class HashMapTest {
	
	//In hasmap we have duplicate values but not keys
	// we can have multiple null values but only one null KEY allowed
	public static void main(String[] args) {
		
		Map map= new HashMap<>();
		
		System.out.println(map.isEmpty());
		
		map.put(1, "Rahul");
		map.put(2, "Ravi");
		map.put(3, "Rahul");
		map.put(null,  null);
		map.put(4,  null);
		map.put(5,  null);
		
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.keySet());
		
		
		
	}

}
