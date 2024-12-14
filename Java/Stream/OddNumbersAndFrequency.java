package Stream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class OddNumbersAndFrequency {
	
	/**
	 * Write a method to return the odd numbers and their frequency from an integer array list passed as an input parameter.
	 */
	
	 private static Map<Integer, Long> countOfOddNumber(List<Integer> intList) {

		  List<Integer> oddList = intList.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());

		  return oddList.stream().collect(Collectors.groupingBy((x -> x), Collectors.counting()));

		 }

	 public static void main(String[] args) {

	//I/P: 1, 2, 3, 4, 4, 5, 6, 7, 7, 5
	// O/P: {1=1, 3=1, 5=2, 7=2}

	  List<Integer> intList = Arrays.asList(1, 2, 3, 4,11, 4, 5, 6, 7, 7, 5,9,11);
	  System.out.println(countOfOddNumber(intList));
	 }

	
	
	

}
