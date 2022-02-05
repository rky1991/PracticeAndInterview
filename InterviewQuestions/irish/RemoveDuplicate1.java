package irish;

public class RemoveDuplicate1 {
	
	
	
    public static void main(String[] args) {
    	 String st="Java is a programming Language j";
         String st1="";
		  
		for (int i = 0; i < st.length(); i++) {
			
            String ff = String.valueOf(st.charAt(i));
            
            if (!st1.contains(ff)) {
                st1 = st1 + st.charAt(i);
            }
        
		}   
        System.out.println(st1);
		
		
	}

}
