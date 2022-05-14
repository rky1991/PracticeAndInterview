package Basics;

public class AllBlocks {
	
	static {
		int a= 10 ;
		System.out.println("Sattic Block-->"+a);
		a=9;
		System.out.println("Static Block Update Variable --"+a);
	}
	
	 {
		int b= 12 ;
		System.out.println("Annonomous Block -->"+b);
		b=9;
		System.out.println("Annonomous Block updated  -->"+b);
	}
	 
	 public static void main(String[] args) {
		 
		System.out.println("Main Methd Started ---->>");
		AllBlocks ob = new AllBlocks();
		
		
	}

}
