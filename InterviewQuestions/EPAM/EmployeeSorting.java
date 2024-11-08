package EPAM;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class EmployeeSorting {
	
	public static void main(String[] args) {
		// Creating a list of Employee
		List<Employee> emp = new ArrayList();
		
		// Adding employee to the list 
		emp.add(new Employee("Rahul", 32, 32000));
		emp.add(new Employee("Ravi", 36, 23000));
		emp.add(new Employee("Dhruv", 27, 31000));
		emp.add(new Employee("Abhi", 32, 35000));
		
		emp.sort(Comparator.comparingInt(Employee :: getAge));
		System.out.println("Employee sorted by Age : ");
		for(Employee empy : emp) {
			System.out.println(empy);
		}
		
		emp.sort(Comparator.comparingDouble(Employee::getSalary));
		
		System.out.println("Employee sorted by salary ");
		for(Employee empy1 : emp) {
			System.out.println(empy1);
		}
		
        emp.sort(Comparator.comparing(Employee :: getName));
		
		System.out.println("Employee sorted by Name ");
		for(Employee empy2 : emp) {
			System.out.println(empy2);
		}
		
	}

}
