package sapient;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMatchingorComparing2 {
	public static void main(String[] args) {
        List<String> list1 = List.of("abc", "a", "cbvv", "b");
        List<String> list2 = List.of("a", "b");

        // Create a map to store the indices of elements in list1
        Map<String, Integer> map = new HashMap<>();
        
        // Populate the map with the index of each element in list1
        for (int i = 0; i < list1.size(); i++) {
        	map.put(list1.get(i), i + 1); // Store 1-based index
        }

        // Iterate over list2 and print the desired output
        for (String item : list2) {
            Integer index = map.get(item); // Get the index from the map
            System.out.println("Intex--->>"+index);
            if (index != null) {
                // Output in the required format
                System.out.println("{" + index + ",\"" + item + "\"}");
            }
        }
    }
}


