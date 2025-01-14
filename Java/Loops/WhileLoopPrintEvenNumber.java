package Loops;

public class WhileLoopPrintEvenNumber {
	//print even number upto 10
	public static void main(String[] args) {
		
		int counter=0;
		while(counter<=10) {
			if(counter%2==0) {
				System.out.println(counter);
			}
			counter++;
		}
		
	}

}
