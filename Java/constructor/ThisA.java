package constructor;

public class ThisA {
	
	int o;
	ThisA(){
		int o;
		System.out.println("this is from ThisA ");
		o=10;
		this.o=20;
		System.out.println(this);
		System.out.println(this.o);
		System.out.println(o);
	}
	public static void main(String[] args) {
		System.out.println("Helo from main method : ");
		
		ThisA ob = new ThisA();
		System.out.println(ob.o);
		System.out.println(ob);
		
	}

}
