package Map.HashMap;

import java.util.*;
import java.util.Map.Entry;

public class ItrateMapUsingItrator {
	
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Rahul", 123);
		map.put("Dhruv", 222);
		map.put("Shivani",111);
		map.put("Neha", 333);
		
		// using iterators
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        
        while(itr.hasNext())
        {
             Map.Entry<String, Integer> entry = itr.next();
             System.out.println("Key = " + entry.getKey() + 
                                 ", Value = " + entry.getValue());
        }
        
        
        System.out.println("************************************************************");
        
        Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key =(String)it.next();
			System.out.println("Key -> "+key+ ", Value -->>"+map.get(key));
			
		}
		System.out.println(map);
        
        
    }
		
	

}
