package stringOperation;

public class StringCompareDoubleEquals {
	
	public static void main(String[] args) {
		
		String st1= "Rahul";
		String st = new String("Rahul");
		
		System.out.println(st == st1);// false		
		System.out.println(st.equals(st1)); //true
		
		String st2 = "Rahul";
		System.out.println(st2 == st1);//true
		
		String st3 = new String("Rahul");
		
		System.out.println(st == st3);//false
		
		//Concat -->
		System.out.println(st1.concat(" Kumar"));
		System.out.println(st.concat(" Yadav"));
		System.out.println(st1.concat(st));
		
		// Object Reference
		System.out.println(st.hashCode());
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
	}

}
