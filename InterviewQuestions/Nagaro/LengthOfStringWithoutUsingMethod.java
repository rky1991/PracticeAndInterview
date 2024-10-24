package Nagaro;

public class LengthOfStringWithoutUsingMethod {
	
	public static void main(String[] args) {
		String st = "Rahul";
		int len=0;
		try {
		while(st!=null) {
			st.charAt(len);
			len++;
			
		}
		System.out.println("String Length "+len);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
