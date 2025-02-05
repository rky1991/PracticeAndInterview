package Wipro;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class SortFruitesBasedOnPrice {
	
	    public static void main(String[] args) {
	        // Creating a Map containing fruit names and their respective prices
	        Map<String, Integer> fruitMap = new HashMap<>();
	        fruitMap.put("Apple", 120);
	        fruitMap.put("Banana", 60);
	        fruitMap.put("Orange", 100);
	        fruitMap.put("Mango", 150);
	        fruitMap.put("Grapes", 200);
	        
	        // Finding the fruit with the maximum price
	        String maxPriceFruit = "";
	        int maxPrice = 0;
	       
	        Iterator<String> itr = fruitMap.keySet().iterator();
	       
	        while(itr.hasNext()) {
	        	String key = itr.next();
	        System.out.println(fruitMap.get(key));
	        if(fruitMap.get(key)>maxPrice) {
	        	maxPrice=fruitMap.get(key);
	        	System.out.println("Max value adding-->>>"+maxPrice);
	        }
	        }
	        
	        System.out.println("Max value -->"+fruitMap.get(maxPrice));
	        System.out.println("Max value -->"+maxPrice);
}
}
