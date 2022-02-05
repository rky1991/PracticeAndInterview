package GlobalLogic;

public class Encap {
	
	private static int a=9;
	private static int b=4;
	
//	Encap(int a, int b){
//		
//	}
	
	
	public static int getter() {
		
		return a;
	}
	public int setterAdd(int a,int b) {
		int res= a+b;
		return res;
	}
	public int setterMultiply(int a,int b) {
		int res= a*b;
		return res;
	}

}
