package EPAM;

import java.util.ArrayList;
import java.util.List;

public class Employee{
	
	private int age;
	private String name;
	private double salary;
	
	
	Employee( String name , int age , double salary){
		this.age=age;
		this.name= name;
		this.salary=salary;
		
	}
	
	// Getter 
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
//	public String toString() {
//		return "Emp Name : "+name +", Age : "+ age +", Salary : "+ salary;
//	}
	
	  public String toString() {
	      return "Employee{" +
	                "name='" + name + '\'' +
	                ", age=" + age +
	                ", salary=" + salary +
	                '}';
	    }
	
//	public static void main(String[] args) {
//		Employee ob = new Employee(24, "Rahul",23000);
////		EmployeeData ob = new EmployeeData(21, "Ravi",20000);
////		EmployeeData ob = new EmployeeData(19, "Rahul",10000);
//		
//		System.out.println(ob.age);
//		System.out.println(ob.salary);
//		System.out.println(ob.name);
//		List ls = new ArrayList<Employee>();
//		ls.add(ob.age=23);
//		ls.add(ob.name="Ravi");
//		ls.add(ob.salary=30222);
//		System.out.println(ls);
//		
//		
//	}
	
	
	
	

}
