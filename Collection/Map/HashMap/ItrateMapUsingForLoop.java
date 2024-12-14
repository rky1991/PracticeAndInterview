package Map.HashMap;

import java.util.*;
import java.util.Map.Entry;

public class ItrateMapUsingForLoop {
	
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Rahul", 123);
		map.put("Dhruv", 222);
		map.put("Shivani",111);
		map.put("Neha", 333);
		
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
		System.out.println("*******************************************");
		
		 // forEach(action) method to iterate map
		map.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));
		
		System.out.println("*******************************************");
		
		// looping over keys
        for (String name : map.keySet()) 
        {
            // search  for value
            Integer id = map.get(name);
            System.out.println("Key = " + name + ", Value = " + id);
        }
				
		
	}

}
