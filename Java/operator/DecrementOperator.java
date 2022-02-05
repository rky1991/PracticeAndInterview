package operator;
//-- ---> Uniray operator
//Post increment(operand --), Preincrement (--operand)
public class DecrementOperator {
	
	public static void main(String[] args) {
		
		int i=5;
		//post decrement (first use then decrement by 1)
		System.out.println(i--);//5
		System.out.println(i);//4
		
		//pre decrement (first decrement by 1 then use)
		int j=5;
		System.out.println(--j);//4
		System.out.println(j);//4
		
		
		
	}
	

}
