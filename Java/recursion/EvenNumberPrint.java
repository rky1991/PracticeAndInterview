package recursion;

public class EvenNumberPrint {
	
	public static void test(int i) {
		
		i++;
		if(i%2==0) {
			System.out.println(i);
		}
		if(i==100) {
			return;
		}
		test(i);
	}
	public static void main(String[] args) {
		test(0);
		System.out.println("Main Ended");
	}

}
