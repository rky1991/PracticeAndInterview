package stringOperation;

public class ReverseWordsInSentense {
	
	public static void main(String[] args) {
		String st= "hello world";
		String revString="";
		String words[]=st.split(" ");
		
		for(int i=0;i<words.length;i++) {
			
			String word = words[i];
			char ch[]=word.toCharArray();
			
			for(int j=ch.length-1;j>=0;j--) {
				revString=revString+ch[j];
			}
			revString=revString+" ";
			
		}
		
		System.out.println(revString);
	}

}
