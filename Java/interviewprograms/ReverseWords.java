package interviewprograms;

public class ReverseWords {
	
	public static void reversWords(String str) {
		String [] st=str.split(" ");
		String revWord="";
		
		for(int i=0;i<st.length;i++) {
			String word=st[i];
			char ch[]=word.toCharArray();
			for(int j=ch.length-1;j>=0;j--){
				revWord=revWord+ch[j];
			}
			revWord=revWord+" ";
			}
		System.out.println("Reverse words ::"+revWord);
		
	}
	public static void main(String[] args) {
		
		String str="hello world";
		reversWords(str);
	}

}
