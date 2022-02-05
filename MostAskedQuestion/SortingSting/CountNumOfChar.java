package SortingSting;

import java.util.HashMap;
import java.util.Map;

//Count Every Character From Given String 
//Using HashMap
public class CountNumOfChar {
	
	
	public static void main(String[] args) {
		
		String str= "My Name Is R@hul :_ Y@d@v ";
		 int size=str.length();
		System.out.println(str+" Size :---->"+size);
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		
		for(int i=0;i<size;i++) {
			char ch=str.charAt(i);
			// Check map contain character or not if contain update count
			
			if(map.containsKey(ch)) {
				int count =map.get(ch);
				map.put(ch,++count);
				//System.out.println(map.keySet());
			}
			
			//It will execute First and put the value in map for the first time.
			// 1 is use to cout atleat one time of that char occrence
			else {
				map.put(ch, 1);
			//System.out.println(map.keySet());
			
			}
		}
		
		System.out.println(map);
		
		
		
	}
	
	

}
