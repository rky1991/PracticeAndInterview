package Typecasting;

public class TC1 {
	//Primitive TypeCasting --> 1.Widning (Converting smaller data type in to larger data type)
	//1.char<int<long<float<double
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
	
	System.out.println(a=(char) b);// can e don but not valid
	System.out.println(b=(byte) a);// not valid 
	//System.out.println(c=b);//byte <short
	System.out.println(b=(byte) c);
		
		
	}
	

}
