package recursion;

public class InDirectRecurssion {
	
	
	public static void test(int i) {
		
		System.out.println("Hello");
		test1(i);
		
	}
    public static void test1(int i) {
    	i++;
		System.out.println("Bye");
		if(i==2) {
			return;
		}
	}
    
    public static void main(String[] args) {
		System.out.println("Main Method Started ");
		test(0);
		System.out.println("Main Method Ended ");
	}
	

}
