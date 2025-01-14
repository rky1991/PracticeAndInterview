package Loops;

public class BreakStmtWhileLoop {
	
	public static void main(String[] args) {
		int i=1, n=5;
		while(i<=5) {
			System.out.println("*");
		
		if(i==2) {
			break;
		}
		
		System.out.println(i++);
	}
		System.out.println(i);
}

}
