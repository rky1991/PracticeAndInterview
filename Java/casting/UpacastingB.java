package casting;

public class UpacastingB extends UpcastingA {
	
	int a= 50;
	static int j=600;
	public void testB() {
		System.out.println("Non Static ->From B class");
	}
	public static void testStaticB() {
		System.out.println("Static ->From B class");
	}

}
