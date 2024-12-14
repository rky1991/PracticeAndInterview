package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GFGStream {
	
	public static void main(String[] args) {
		
//		int ar[] = {10,20,21,5,3,52};
		List<Integer> ls = Arrays.asList(10,20,21,5,30,9);
		
		ls.stream()
		.filter(x-> x%2==0)
		.filter(x-> x > 10)
		.forEach(System.out::println);
		
		
	}

}
