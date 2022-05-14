package MustAwarePrograms;

public class FibnaciSeariesWhileLoop {
	
	
	public static void main(String[] args) {
		
		int num =10;
		int t1 = 0,t2 = 1,sum=0;
		while(sum<num ) {
			sum = t1+t2;
			System.out.println(sum +" ");
			t1=t2;
			t2=sum;
			
		}
		
	}

}
