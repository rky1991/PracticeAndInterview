package CustomeList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import EPAM.Employee;

public class EmployeeSortingBasedOnDiffParameter {
	
	public static void main(String[] args) {
		// Creating a list of Employee
		List<Employee1> emp = new ArrayList();
		
		// Adding employee to the list 
		emp.add(new Employee1("Rahul", 32, 32000));
		emp.add(new Employee1("Ravi", 36, 23000));
		emp.add(new Employee1("Dhruv", 27, 31000));
		emp.add(new Employee1("Abhi", 32, 35000));
		
		emp.sort(Comparator.comparingInt(Employee1 :: getAge));
		System.out.println("Employee sorted by Age : ");
		for(Employee1 empy : emp) {
			System.out.println(empy);
		}
		
		emp.sort(Comparator.comparingDouble(Employee1::getSalary));
		
		System.out.println("Employee sorted by salary ");
		for(Employee1 empy1 : emp) {
			System.out.println(empy1);
		}
		
        emp.sort(Comparator.comparing(Employee1 :: getName));
		
		System.out.println("Employee sorted by Name ");
		for(Employee1 empy2 : emp) {
			System.out.println(empy2);
		}
		
	}

}
