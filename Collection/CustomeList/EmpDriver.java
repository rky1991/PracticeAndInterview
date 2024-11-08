package CustomeList;

import java.util.ArrayList;

public class EmpDriver {
	
	public static void main(String[] args) {
		
		ArrayList<Emp> ls = new ArrayList<>();
		
		Emp e1 = new Emp("Rahul", 32, 40000);
		Emp e2 = new Emp("Ravi", 42, 14000);
		Emp e3 = new Emp("Dhruv", 27, 32000);
		Emp e4 = new Emp("Abhi", 30, 35000);
		
		//Add Employee object to Arraylist 
		ls.add(e1);
		ls.add(e2);
		ls.add(e3);
		ls.add(e4);
		ls.add(new Emp("Raghav", 45, 50000));
		System.out.println("Emp type List Object ref -->"+ls);
		
		for(int i =0 ; i<ls.size();i++) {
			System.out.println("Empployee Name -"+ls.get(i).name);
			System.out.println("Employee age -"+ls.get(i).age);
			System.out.println("Employee Salary -"+ls.get(i).salary);
			ls.get(i).work();
		}
		
		
	}

}
