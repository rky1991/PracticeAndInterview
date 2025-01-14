package sapient;

public class Abstraction1Driver extends Abstraction1 {
	
	Abstraction1Driver(){
		super();
		System.out.println("4");
	}
	
	static {
		System.out.println("Static Block Child class ");
	}
	public static void main(String[] args) {
		
	   new Abstraction1Driver();
	   System.out.println("***********************");
	   new Abstraction1();
	}
	{
		System.out.println("3");
	}
}
