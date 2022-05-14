package MustAwarePrograms;

public class FibnaciSearies {
	
	public static void main(String[] args) {
		
		int num =10;int t1=0,t2=1,sum;
		
		for (int i=1;i<=num;++i) {
			
			System.out.print(t1+" ");
			sum =t1+t2;
			t1=t2;
			t2=sum;
			
			
		}
		
		
	}

}
