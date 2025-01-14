package Loops;

public class ContinueStmt {
	
	public static void main(String[] args) {
		
		// Check condition for continue
        // skip the execution of loop when i==2                  
		int c =1 ,n=5;
		while(c<=n) {
			System.out.println("*");
			if(c==2) {
				c++;
				System.out.println("inside if");
				continue;
			}
			System.out.println(c++);
		}
	}

}
