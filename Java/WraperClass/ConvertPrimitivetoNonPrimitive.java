package WraperClass;

public class ConvertPrimitivetoNonPrimitive {
	
	public static void main(String[] args) {
		int i=10; // Primitive Data Type
		System.out.println(i);
		Integer b= 10; // Non primitive data type
		System.out.println(b);
		// Conversion of primitive to non primitive
		Integer x= Integer.valueOf(i);
		System.out.println(x);
	   // Conversion of primitive to non primitive int to String 
		String s = String.valueOf(i);
		System.out.println("Convert Number to String--> "+s);
		Integer c= Integer.parseInt(s);
		System.out.println("Convert String to Number -->"+c);
		String st ="Test";
		Integer cc= Integer.parseInt(st);
		System.out.println("Error -->"+cc);
		
	}

}
