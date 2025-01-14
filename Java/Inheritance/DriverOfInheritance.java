package Inheritance;

public class DriverOfInheritance extends Inheritance {

	static int x = 30;
	int y = 40;
	static {
		System.out.println("From Static Block of Sub Class: ");
	}
	{
		System.out.println("From Non Static Block of Sub Class: ");
	}

	public DriverOfInheritance() {
		System.out.println("From Constructor Block of Sub Class: ");
	}

	public static void main(String[] args) {
		System.out.println("From Main method of Sub Class: ");

		System.out.println(x); // static member of super class
		System.out.println(i); // static member of sub class
		DriverOfInheritance ob = new DriverOfInheritance();
		System.out.println(ob.x); // 30 ---static member of sub class
		System.out.println(ob.y); // 40 ---non static of sub class
		System.out.println(ob.i);// 10 -static member of super class
		System.out.println(ob.j);// 20 -non static of super class

		/**Output
		 * From Static Block of Super Class:
		 * From Static Block of Sub Class: 
		 * From Main method of Sub Class:
		 *  30 
		 *  10 
		 *  From Non Static Block of Super Class: 
		 *  From Constructor Block of Super Class: 
		 *  From Non Static Block of Sub Class: 
		 *  From Constructor Block of Sub Class: 
		 *  30 
		 *  40
		 *  10
		 *  20
		 */
		Inheritance ob1 = new Inheritance();
		//System.out.println(ob1.x); // 30 --- can not access static member of sub class
		//System.out.println(ob1.y); // 40 ---can not access non static of sub class
		System.out.println(ob1.i);// 10 -static member of super class
		System.out.println(ob1.j);// 20 -non static of super class
	}

}
