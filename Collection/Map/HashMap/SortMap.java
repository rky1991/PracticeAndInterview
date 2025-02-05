package Map.HashMap;
import java.util.*;

public class SortMap {
	
	    public static void main(String[] args) {
	        // Creating a Map containing fruit names and their respective prices
	        Map<String, Integer> fruitPrices = new HashMap<>();
	        fruitPrices.put("Apple", 120);
	        fruitPrices.put("Banana", 60);
	        fruitPrices.put("Orange", 100);
	        fruitPrices.put("Mango", 150);
	        fruitPrices.put("Grapes", 200);
	        
	        // Using a TreeMap to sort the Map by values (prices)
	        Map<String, Integer> sortedMap = sortByValue(fruitPrices);

	        // Displaying the sorted Map
	        System.out.println("Fruits sorted by price (ascending order):");
	        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
	    
	    // Helper function to sort the Map by values (prices)
	    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
	        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
	        
	        // Sorting the list using a comparator that compares the values (prices)
	        list.sort(Map.Entry.comparingByValue());
	        
	        // Creating a LinkedHashMap to preserve the order after sorting
	        Map<String, Integer> sortedMap = new LinkedHashMap<>();
	        
	        for (Map.Entry<String, Integer> entry : list) {
	            sortedMap.put(entry.getKey(), entry.getValue());
	        }
	        
	        return sortedMap;
	    }
	


}
