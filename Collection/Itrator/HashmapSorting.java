package Itrator;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashmapSorting {
	
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(12, "Rahul");
		map.put(1, "Raghu");
		map.put(5, "Ravi");
		map.put(13, "Rob");
		map.put(2, "Ravi");
		
		
		System.out.println(map);
		Iterator<Integer> it = map.keySet().iterator();
		System.out.println("Before Sorting"+map);
		
		while(it.hasNext()) {
			int key =(int)it.next();
			System.out.println("RoleNO -> "+key+ " Name -->>"+map.get(key));
			
		}
		System.out.println("**********************************");
		Map<Integer, String> map1=new TreeMap<Integer, String>(map);
		System.out.println("Tree Map -->"+map1);
		

		
				
		
	}

}
