package GlobalLogic;

public class Test {
	
	// check two numeric value
	
	
	public static boolean testNumeric(int a, int b) {
		if(a==b) {
			System.out.println(" two int type value are same");
			return true;
		}
		return false;
	}
	public static boolean testNumeric(float a,float b) {
		if(a==b) {
			System.out.println(" two float type value are same");
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		float a=12.4f;
		float b=123.0f;
		testNumeric(12,13.5);
		
		
	}
	
	

}
