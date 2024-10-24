package Nagaro;

public class LenghtString {
	
	public static void main(String[] args) {
		
	String st ="Rahul";
	   st = st + '\0';
	int count =0;
	
	for (int i = 0; st.charAt(i) != '\0'; i++) {
        count++;
    }
	System.out.println(count);
	
	}

}
