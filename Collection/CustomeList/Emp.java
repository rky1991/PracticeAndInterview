package CustomeList;

public class Emp {
	 int age;
	 String name;
	 double salary;
	
	Emp(){
		//Default Constructor
	}
	
	Emp( String name , int age , double salary){
		this.age=age;
		this.name= name;
		this.salary=salary;
		
	}
	
	public void work() {
		System.out.println("Work Method Start ------------------------------>>>");
		System.out.println("Employee ->" +name + " is working on Salary ->"+salary+" and his age is ->"+age);
		System.out.println("Work Method Finish ----------------------------->>>");
	}
	public String toString() {
		return "Emp Name : "+name +", Age : "+ age +", Salary : "+ salary;
	}
	

}
