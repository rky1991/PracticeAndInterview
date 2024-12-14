package CommonQuestion;

import java.util.HashSet;
import java.util.Set;

public class FindRepetedWordsInSentence {
	
		  
	    public static void main(String[] args) 
	    { 
	        String expression 
	            = "Hi, I am Rahul and I am a programmer i am using java "; 
	  
	        // splitting words using regex 
	        String[] words = expression.split("\\W"); 
	  
	        Set<String> set = new HashSet<>(); 
	  
	        // here we are iterating in Array 
	        for (int i = 0; i < words.length - 1; i++) { 
	  
	            for (int j = 1; j < words.length; j++) { 
	  
	                // if strings matched then adding strings in 
	                // Set because if we ad same string set will 
	                // remove one and we have only repeated 
	                // words. 
	                if (words[i].equals(words[j]) && i != j) { 
	                    set.add(words[i]); 
	                } 
	            } 
	        } 
	  
	        // here we are printing the set 
	        System.out.println(set); 
	    } 
	}


