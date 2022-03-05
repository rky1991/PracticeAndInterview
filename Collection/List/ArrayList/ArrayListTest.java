package List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	
	
	
	public static void main(String[] args) {
		List ob= new ArrayList();
		ob.add("Rahul");
		ob.add(1);
		ob.add("Rahu");
		ob.add(4);
		ob.add("Raul");
		ob.add(12);
		ob.add('W');
		System.out.println(ob);
		ob.add(2,"TY");
		System.out.println(ob);
		System.out.println(ob.contains("Rul"));
		
		System.out.println("TTTT"+ob.get(0).toString());
		
		Object[] ar = ob.toArray();
		System.out.println("array representation :"+ar.toString());
		
		
		
	}
	

}
