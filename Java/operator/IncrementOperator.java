package operator;

//++ ---> Uniray operator
// Post increment(operand ++), Preincrement (++operand)
public class IncrementOperator {
	
	
	public static void main(String[] args) {
		int i=5;
	   // post increment ,First use then increment by 1; 
		System.out.println(i++);//5
		System.out.println(i);//6
		
		
		int j=5;
		// pre increment ,First increment use then by 1; 
				System.out.println(++j);//6
				System.out.println(j);//6
		
		
	}
	 
	

}
