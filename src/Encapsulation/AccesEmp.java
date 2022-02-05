package Encapsulation;

public class AccesEmp {
	
	
	public static void main(String[] args) {
		
		Emp.setID(123);
		int id = Emp.GetID();
		System.out.println(id);
		Emp.setPckg(8.9);
		System.out.println(Emp.getPckg());
		
	}


}
