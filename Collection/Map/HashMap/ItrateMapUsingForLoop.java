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
	
		System.out.println("*******************************************");
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
		System.out.println("*******************************************");
		
		 // forEach(action) method to iterate map stream api
		map.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));
		
		System.out.println("*******************************************");
		
		// looping over keys
        for (String key : map.keySet()) 
        {
            // search  for value
            System.out.println("Key = " + key + ", Value = " + map.get(key));
        }
				
		
	}

}
