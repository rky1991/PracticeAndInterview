package constructor;

public class ThisA {
	
	int o;
	ThisA(){
		int o;
		System.out.println("This is from Construstor ");
		o=10;
		this.o=20;
		System.out.println("Object Address -->>"+this);
		System.out.println(this.o);
		System.out.println(o);
	}
	public static void main(String[] args) {
		System.out.println("Hello from main method : ");
		
		ThisA ob = new ThisA();
		System.out.println(ob.o);
		System.out.println(ob);
		
	}

}
