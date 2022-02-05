package interviewprograms;

public class StringPelindrom {
	
	public static void stringPelendrom(String str) {
		System.out.println("Entered String "+str);
		String orgString =str.toLowerCase();
		String revStr="".toLowerCase();
		char[] ch = str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			revStr= revStr+ch[i];
		}
		if(revStr.equals(orgString)) 
			System.out.println("String is pelindrom");
		else
			System.out.println("String is not pelindrome");
	}
	public static void main(String[] args) {
		stringPelendrom("aba");
	}

}
