package stringOperation;

public class CompareToMethodUse {

	public static void main(String[] args) {

		String st = "Hello";
		String st1 ="Hello";
		String st2 ="hello";

		// "==" Comparing two object Object 
		System.out.println(st==st1); // True
		System.out.println(st==st2); // false


		//Equals Method Comparing two string not there object Object 
		System.out.println(st.equals(st1)); // True
		System.out.println(st.equals(st2)); // false
		System.out.println(st.equalsIgnoreCase(st2)); // True

		//CompareTo() return Integer Value , 0 if string equals , positive and negative if not quals 
		System.out.println(st.compareTo(st1)); // 0
		System.out.println(st.compareTo(st2)); // -32
		System.out.println(st.compareToIgnoreCase(st2)); // 0






	}

}
