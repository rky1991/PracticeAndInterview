package Map.HashMap;
import java.util.*;
import java.util.Map.Entry;

public class SortMap2 {
	
	    public static void main(String[] args) {
	        // Creating a Map containing fruit names and their respective prices
	        Map<String, Integer> fruitPrices = new HashMap<>();
	        fruitPrices.put("Apple", 120);
	        fruitPrices.put("Banana", 60);
	        fruitPrices.put("Orange", 100);
	        fruitPrices.put("Mango", 150);
	        fruitPrices.put("Grapes", 200);
	        
	        // Using a TreeMap to sort the Map by values (prices)
	        //Map<String, Integer> sortedMap = sortByValue(fruitPrices);
	        
            List<Map.Entry<String, Integer>> list = new ArrayList<>(fruitPrices.entrySet());
            System.out.println("List Map type -->"+list);
	        
	        // Sorting the list using a comparator that compares the values (prices)
	        list.sort(Map.Entry.comparingByValue());
	        
	        System.out.println("List Map type after Sort -->"+list);
	        
	        // Creating a LinkedHashMap to preserve the order after sorting
	        Map<String, Integer> sortedMap = new LinkedHashMap<>();
	        
	        for (Map.Entry<String, Integer> entry : list) {
	            sortedMap.put(entry.getKey(), entry.getValue());
	        }
	        
	        
	        // Displaying the sorted Map
	        System.out.println("Fruits sorted by price (ascending order):");
	        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	        
	    }
	    
	    


}
