package stringOperation;

public class SubString {
	
	public static void main(String[] args) {
		String st = "Java Programming";
		System.out.println(st.contains("Java"));
		System.out.println(st.contains("tre"));
		System.out.println(st.endsWith("ing"));
		System.out.println(st.indexOf('v'));
		System.out.println(st.indexOf("Java"));
		System.out.println(st.indexOf("Programming"));
		System.out.println(st.indexOf(1, 6));
		System.out.println(st.replace("Java", "Python"));
		System.out.println("New String ->"+st);
		System.out.println(st.substring(1, 7));
		
		
	}

}
