package interviewprograms;

public class ReverseWords {

	public static void reversWords(String str) {
		String[] st = str.split(" ");
		String revWord = "";

		for (int i = 0; i < st.length; i++) {
			String word = st[i]; // Got single word
			char ch[] = word.toCharArray(); //convert that word to char array

			// Travers to char array ()single word
			for (int j = ch.length - 1; j >= 0; j--) {
				revWord = revWord + ch[j];
			}

			revWord = revWord + " ";

		}
		System.out.println("Reverse words ::" + revWord);

	}

	public static void main(String[] args) {

		String str = "Welcome to India";
		reversWords(str);
	}

}
