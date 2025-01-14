package Loops;

public class WhilePrintAllNumberDivisibleBy3 {
	
	public static void main(String[] args) {
		
		int counter =0;
		while(counter<=100) {
			
			if(counter %3 ==0) {
				System.out.println(counter);
			}
			
			counter ++;
		}
	}

}
