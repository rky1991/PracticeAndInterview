package List;

import java.util.ArrayList;

public class RemoveGivenValueFromList {
	
	/**
     * Removes all occurrences of the given value from the ArrayList.
     *
     * @param list  The ArrayList to modify
     * @param value The value to remove
     */
    public static void removeValue(ArrayList<String> list, String value) {
        list.removeIf(value::equals);
    }
    
    public static void removeValue1(ArrayList<String> list, String value) {
        list.remove(value);
    }
	
	
	public static void main(String[] args) {
        // Example ArrayList with string values
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("banana");
        stringList.add("grape");

        System.out.println("Original List: " + stringList);

        // Remove a value
        String valueToRemove = "banana";
        removeValue(stringList, valueToRemove);

        System.out.println("Updated List: " + stringList);
    }

    

}
