package Encapsulation;

public class Emp {
	
	private static int id;
	private static double pckg;
	
	public static void setID(int id) {
		Emp.id= id;
		
	}
	
	public static int GetID() {
		System.out.println("Get the id of EMP class");
		return id;
		
	}
	
	public static void setPckg(double d) {
		Emp.pckg=d;
	}
	
	public static double getPckg() {
		System.out.println("Get the pacakge of EMP class");
		return pckg;
		
	}



}
