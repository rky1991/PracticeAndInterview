package NIIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByKeyMap {
	
	
	public static void main(String[] args) {
		
	Map<Integer, String> map = new HashMap<Integer,String>();
	map.put(12, "Rahul");
	map.put(1, "Raghu");
	map.put(5, "Ravi");
	map.put(13, "Rob");
	map.put(2, "Ravi");
	
	System.out.println(map);
	
	
	ArrayList<Integer> ls = new ArrayList<>(map.keySet());
	Collections.sort(ls);
	for(int k :ls) {
		System.out.println("Key -->"+k+ " Value --> "+map.get(k));
	}
	
	TreeMap<Integer, String> ts = new TreeMap<Integer,String>(map);
	System.out.println("Tree map -->"+ts);
	
	}

}
