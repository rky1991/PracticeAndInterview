package Abstraction;

public class DriverOfAbs1 extends Abstraction1 {
	
	public static void main(String[] args) {
		
		DriverOfAbs1 obj = new DriverOfAbs1();
		obj.Abs_m1();
		obj.m1();
		
	}

	@Override
	public void Abs_m1() {
		// TODO Auto-generated method stub
		
		System.out.println("Abstract classs method implementation");
		
	}
	
	

}
