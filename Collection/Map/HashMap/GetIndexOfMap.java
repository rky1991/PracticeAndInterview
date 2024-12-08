package Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class GetIndexOfMap {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		System.out.println(map.isEmpty());
		
		map.put("Rahul",1);
		map.put("Ravi",2);
		map.put("Dhruv",3);
		
		Integer mp = map.get("Rahul");
		System.out.println(mp);
	}

}
