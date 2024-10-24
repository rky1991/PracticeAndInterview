package ConversionOfCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListToMap {
	
	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("Rahul");
		list.add("Neha");
		list.add("Mukku");
		list.add("Dhruv");
		list.add("Ravi");
		System.out.println(list.get(0));
		System.out.println(list.contains("Ruhul"));
		
		/**Not Final solution  **/
		
		Map<Integer ,String> map = new HashMap<Integer ,String>();
		for(String st : list) {
			
			System.out.println(map.put(st.indexOf(st), st));
			System.out.println(map);
			
			
		}
		System.out.println(map);
		
	}

}
