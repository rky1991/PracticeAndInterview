package StringRecursion;

public class ReverseString {
	
	public String reverseString(String st) {
		
		if(st.isEmpty()) {
			System.out.println("String is Null");
			return st; 
			
		}
		else {
		 return reverseString(st.substring(1))+st.charAt(0);
		}
	}
	
	public static void main(String[] args) {
		
		ReverseString rs = new ReverseString();
		
		String st = "Neha";
		String reverserSgtring = rs.reverseString(st);
		System.out.println(reverserSgtring);
	
	}

}
