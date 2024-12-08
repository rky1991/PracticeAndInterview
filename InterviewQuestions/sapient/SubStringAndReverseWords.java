package sapient;

//String str="RahulKumar ChandanKumar";
//O/p: n1=3 to n2=7th index of each word and then reverse
//"hulKu andan"
//reverse: "uKluh nadna"

public class SubStringAndReverseWords {

	public static void main(String[] args) {
		String str = "RahulKumar ChandanKumar";

		// Split the string into words
		String[] words = str.split(" ");

		// StringBuilder to hold the result
		StringBuilder result = new StringBuilder();

		// Process each word an
		for (String word : words) {
			String wordAfterTrim = word.substring(2, 7);
			// Reverse the current word and append/add it to the result
			StringBuilder sb = new StringBuilder(wordAfterTrim);
			result.append(sb.reverse()).append(" ");
		}

		// Print the final output
		System.out.println(result);
	}

}
