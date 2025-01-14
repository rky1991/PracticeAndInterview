package Conditional;

public class VovelOrConsonent {
	
	public static void main(String[] args) {
		String s = "AceiouBJ";
		String st=s.toLowerCase();
		
		for(int i=0; i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch +" <-is Vowel");
			}
			else
				System.out.println(ch+"<- is Consonent");
		}
	}

}
