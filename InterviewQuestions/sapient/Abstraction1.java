package sapient;

public class Abstraction1 {
	
	static {
		System.out.println("Static block Abstraction1 Parent Class ");
	}
	
	public Abstraction1() {
	super();
	System.out.println("2");
	}
	
	{
		System.out.println("1");
	}
	
	

}
