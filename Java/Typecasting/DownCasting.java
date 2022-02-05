package Typecasting;

public class DownCasting {
	
	//Primitive TypeCasting --> 1.Narrowing (Converting larger data type in to smaller data type)
		//1.char>int>long>float>double
		//2.byte<int <long<float<doule
		//3.short<int<long<float<double
	
	public static void main(String[] args) {
		
		char a= 'n';
		byte b=20;
		short c=12;
		int d=1234;
		long e= 654321l;
		float f=12.4f;
		double g=14.5d;
		
		
		System.out.println(e=(long) f);
		System.out.println(f=(float) g);
	}
	

}
