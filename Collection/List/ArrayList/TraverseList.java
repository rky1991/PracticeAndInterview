package List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.bytebuddy.implementation.bytecode.collection.ArrayAccess;

public class TraverseList {
	
	public static void main(String[] args) {
		
		List list1= new ArrayList<>(41);
		
		String str[]= {"Rahul","Ravi","Raghu","Kishan","Neha","Shivani"};
		System.out.println(str.length);
		
		for(int i=0;i<str.length;i++) {
		 list1.add(str[i]);
		 System.out.println(str[i]+" <<<---Added to List ");
		}
		
		System.out.println("List After Adding Elements : -->"+list1);
		
		
		
		// *********  Another Concept **********
		List<String> list = Arrays.asList(str);
		//list.add("Ankit");// Can Not add element here because list is reference of List Interface
		System.out.println("List After Adding Elements : -->"+list);
		ArrayList<String> ob = new ArrayList<>(list);
		ob.add("Rama");
		ob.add("Ankit");
		for(String b: ob) {
			System.out.println(b);
		}
		
		System.out.println("List After Adding Elements : -->"+ob);
	}

	

}
