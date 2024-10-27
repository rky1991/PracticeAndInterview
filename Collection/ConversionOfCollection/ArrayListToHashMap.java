package ConversionOfCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListToHashMap {
	
	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("Rahul");
		list.add("Neha");
		list.add("Mukku");
		list.add("Dhruv");
		list.add("Ravi");
		System.out.println(list.get(0));
		System.out.println(list.contains("Ruhul"));
		
		/**One Methdod to Convert Array List to Map ,
		ArrayList Index Number(Integer)  is -> Key Of Map
		ArrayList Index Value(String)  is -> Value Of Map  **/
		
		Map<Integer ,String> map = new HashMap<Integer ,String>();
		
		for(int i=0; i<list.size();i++) {
			System.out.println(map.put(i,list.get(i)));
			System.out.println(map);
			
		}
	}

}
