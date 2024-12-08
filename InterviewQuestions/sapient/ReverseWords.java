package sapient;


// String str="RahulKumar ChandanKumar";
// O/p: n1=3 to n2=7th index of each word and then reverse
// "hulKu andan"
// reverse: "uKluh nadna"

public class ReverseWords {

	public static void main(String[] args) {

		String st ="RahulKumar ChandanKumar";
		String ar[] = st.split(" ");
		StringBuffer output = new StringBuffer();

		for(int i=0;i<ar.length;i++) {

			// Sub String to Trim word based on index number
			String trimedWord = ar[i].substring(2,7);
			StringBuffer sb = new StringBuffer(trimedWord);
			System.out.println("Final Output -->"+output.append(sb.reverse()+" "));

		}

		String word1 = ar[0].substring(2,7);
		System.out.println(word1);
		String word2 = ar[1].substring(2,7);
		System.out.println(word2);
		StringBuffer sb = new StringBuffer(word1);
		StringBuffer sb1 = new StringBuffer(word2);
		System.out.println("Final Output Witout Optimized Code "+sb.reverse() +" "+sb1.reverse());


	}

}
