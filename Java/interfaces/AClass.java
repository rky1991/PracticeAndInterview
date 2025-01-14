package interfaces;

public class AClass implements A{
	
	public void test1() {
		System.out.println("Bye");
	}
	
	public static void main(String[] args) {
		AClass ob1=new AClass();
		
		A ob = ob1;
		ob.test();
		ob1.test();
		ob1.test1();
		System.out.println(ob +" "+ob1);
		
		System.out.println(ob.hashCode() +" "+ob1.hashCode());
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
	}

}
