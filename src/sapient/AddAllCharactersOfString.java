package sapient;

public class AddAllCharactersOfString {
	
	public static void main(String[] args) {
		
		String st ="98745";

		char c='0';// 48
		int ascii =c;
		System.out.println("Ascci of 0 :-->"+ascii);
		int sum=0;
		for(int i=0;i<st.length();i++) {
			char ch = st.charAt(i);
			int asscci =ch;
			System.out.println("Ascii Vaue of "+asscci);
			if(Character.isDigit(ch)) {
				
				sum=sum+ch-'0';
				System.out.println("Sum of chars "+sum);
				
			}
				
		}
		
		System.out.println(sum);
		
	}

}
