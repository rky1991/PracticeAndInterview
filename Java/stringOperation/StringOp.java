package stringOperation;

public class StringOp {
	
	public static void main(String[] args) {
		
		String s="helloo";
		s.concat("bye");
		System.out.println(s);
		
		String s1=new String("helloo");
		System.out.println(s1.hashCode());
		String s2 = s1.concat("bye");
		System.out.println(s2);// hellobye
		System.out.println(s);
	
	
	}

}
