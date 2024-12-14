package sapient;

import java.util.List;

public class ListMatchingorComparing {

	public static void main(String[] args) {
		List<String> list1 = List.of("abc", "a", "cbvv", "b");
		List<String> list2 = List.of("a", "b");

		//Output matching elements in format {index, value}
		for (String item : list2) {
			int index = list1.indexOf(item); // Find index of item in list1
			if (index != -1) {
				// Output in the required format
				System.out.println("{" + (index + 1) + ",\"" + item + "\"}"); // Add 1 to index to make it 1-based
			}
		}
	}
}


