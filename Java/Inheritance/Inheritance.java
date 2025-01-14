package Inheritance;

public class Inheritance {
	static int i=10;
	int j =20;
	static{
		System.out.println("From Static Block of Super Class: ");
	}
	{
		System.out.println("From Non Static Block of Super Class: ");
	}
	public Inheritance() {
		System.out.println("From Constructor Block of Super Class: ");
	}
	
	public static void main(String[] args) {
		System.out.println("From main method of Super class");
	}

}
