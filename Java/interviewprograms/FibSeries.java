package interviewprograms;


 // 0 1 2 3 5 8 13 21.
public class FibSeries {
	
	// display fib series up to term 
	public static void fibSeries_ForLoop(int t) {
		System.out.println("for loop Series");
		int n1=0, n2=1;
		int res=0;
		for(int i=0;i<=t;++i) {
			System.out.println(res);
			res=n1+n2;
			n1=n2;
	     	n2=res;
		}
		System.out.println("******************************");
	}
	// display fib series up to term 
	public  static void fibSeries_While() {
		System.out.println("While loop Series");
		int i=0,n=10,t1=0,t2=1,res=0;
		while(i<=n) {
			System.out.println(res);
			res= t1+t2;
			t1=t2;
			t2= res;
			i++;
		}
		System.out.println("******************************");
	}
	// display fib series up to given number not term 
	public static void fibSeriesUptoGivenNo(int n) {
		int t1=0,t2=1,res=1;
		System.out.println("Febseries up to**: "+n);
		while(t1<=n) {
			 System.out.println(res);
			 res= t1+t2;
			 t1=t2;
			 t2=res;
			 
//			 if(res>n)
//				 break;
		}
	}
	public static void main(String[] args) {
		   
		    //fibSeries_ForLoop(10);
		   //fibSeries_While();
		  fibSeriesUptoGivenNo(100);
			   
		
		}
	
}
