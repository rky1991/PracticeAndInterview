package Wipro;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class SortFruitesBasedOnPrice2 {
	
	    public static void main(String[] args) {
	        // Creating a Map containing fruit names and their respective prices
	        Map<String, Integer> fruitPrices = new HashMap<>();
	        fruitPrices.put("Apple", 120);
	        fruitPrices.put("Banana", 60);
	        fruitPrices.put("Orange", 100);
	        fruitPrices.put("Mango", 150);
	        fruitPrices.put("Grapes", 200);
	        
	        // Finding the fruit with the maximum price
	        String maxPriceFruit = "";
	        int maxPrice = 0;
	        
	        //Set<Entry<String, Integer>> entrySet = fruitPrices.entrySet();
	        
	        //Set<Map.Entry<String, Integer>> entrySet = fruitPrices.entrySet();
	     
	        
	        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
	            if (entry.getValue() > maxPrice) {
	                maxPrice = entry.getValue();
	                maxPriceFruit = entry.getKey();
	            }
	        }
	        
	        // Display the fruit with the maximum price
	        System.out.println("The fruit with the maximum price is " + maxPriceFruit + " with a price of " + maxPrice);
	    }
	


}
