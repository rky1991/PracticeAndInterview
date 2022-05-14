package stringOperation;

public class ReverseWordsInSentense {
	
	public String reverseWordsOfSentense(String orginalSentense) {
		String reverseCharOFWords="";
		String words[]=orginalSentense.split(" ");
		for (int i=0;i<words.length;i++) {
			String singleWord=words[i];
			char chars[]=singleWord.toCharArray();
			
			for(int j=chars.length-1;j>=0;j--) {
				
				reverseCharOFWords=reverseCharOFWords+chars[j];
				
			}
			reverseCharOFWords=reverseCharOFWords+" ";
		}
		
		return reverseCharOFWords;
	}
	
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
		
		String name="My Name is Rahul";
		
		ReverseWordsInSentense obj = new ReverseWordsInSentense();
		String rev=obj.reverseWordsOfSentense(name);
		System.out.println("Reversed Words --->>>>"+rev);
	}
	
	
	

}
