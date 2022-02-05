package stringOperation;

public class StringBufferOP {
	
	public static void main(String[] args) {
		
		
		String str= "Hello world";
		StringBuffer s= new StringBuffer(str);
		System.out.println(s);
		System.out.println(s.append("Of india"));
		System.out.println(s.reverse());
	}

}
