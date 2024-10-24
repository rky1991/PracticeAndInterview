package Nagaro;

public class ReverseStringUsingRecurssio {
	
	
	
	public static void reverseString(String st){
	
		if(st ==null || st.length()<=1) {
			System.out.println(st);
		}
		else {
			System.out.print(st.charAt(st.length()-1));
			reverseString(st.substring(0,st.length()-1));
		}
		
	}
	
	
	public static void main(String[] args) {
	    String st = "Rahul";
		System.out.println("Main Method Started");
		reverseString(st);
		System.out.println("Main Method Ended");
		
		
		
	}
	 

}
