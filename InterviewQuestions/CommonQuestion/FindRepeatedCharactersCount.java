package CommonQuestion;

import java.util.HashMap;
import java.util.Map;

public class FindRepeatedCharactersCount {
	
	
	public static void main(String[] args) {
		
		String st= "RRahhuull_ kkuummar _YYyyaadav __";
		System.out.println(st);
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		
		for (int i=0;i<st.length();i++) {
			char c = st.charAt(i);
			if (map.containsKey(c)) {
				int count = map.get(c);
				map.put(c, ++count);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}
