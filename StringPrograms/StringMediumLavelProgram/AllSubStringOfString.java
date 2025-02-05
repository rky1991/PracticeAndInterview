package StringMediumLavelProgram;

public class AllSubStringOfString {
	
	    static void printSubstrings(String s) {
	        int n = s.length(); 
	        //abc
	        for (int i = 0; i < n; i++) {
	            for (int j = i+1; j <= n; j++ ) {
	              
	                // Print the substring from index i to j
	                System.out.println(s.substring(i, j));
	            }
	        }
	    }

	    public static void main(String[] args) {
	        String s = "abcd";  
	        printSubstrings(s);
	    }

}
