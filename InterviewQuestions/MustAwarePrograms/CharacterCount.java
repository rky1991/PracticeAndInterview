package MustAwarePrograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
	
	public static void main(String[] args) {
		
		String str= "My Name is Rahul Kumar 1991";
		int count =0;
		
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i=0 ;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				count = map.get(ch);
				map.put(ch, ++count);
			}
			else {
				map.put(ch, 1);
			}
			
		}
		
		System.out.println("Print Map--->>"+map);
 		
		
		
	}

}
