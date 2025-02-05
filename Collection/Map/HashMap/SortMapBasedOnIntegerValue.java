package Map.HashMap;
import java.util.*;

public class SortMapBasedOnIntegerValue {
	
	

	    public static void main(String[] args) {
	        // Creating a Map containing fruit names and their respective prices
	        Map<String, Integer> fruitPrices = new HashMap<>();
	        fruitPrices.put("Apple", 120);
	        fruitPrices.put("Banana", 60);
	        fruitPrices.put("Orange", 100);
	        fruitPrices.put("Mango", 150);
	        fruitPrices.put("Grapes", 200);
	        
	        // Sorting the Map based on the price (values)
	        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(fruitPrices.entrySet());
	        
	        // Sorting the list using a comparator based on the values (prices)
	        sortedList.sort((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()));
	        
	        // Displaying the sorted Map
	        System.out.println("Fruits sorted by price (ascending order):");
	        for (Map.Entry<String, Integer> entry : sortedList) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
	


}
