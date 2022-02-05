package operator;

// AND Operator ---> && both side true then true else false

public class LogicalOperator {
	 
	public static void main(String[] args) {
	int a=10;
	boolean b= true;
	boolean c= false;
	
	System.out.println(b&&c);//false
	System.out.println(c&&b);//false
	System.out.println(a>4 && b);//true
	
	// OR Operator one side is true op will be true 
	System.out.println(b||a>20);//true
	System.out.println(c||a>20);
	
	
	}
}
