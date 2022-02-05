package operator;

public class OperatorBasic {
	
	public static void main(String[] args) {
		
		int a=10;
		a=a+10;
		System.out.println(a);
		a+=10;
		System.out.println(a);
		//****
		int b=20;
		b*=3;// b=b*3;
		System.out.println(b);//60;
		
		//****
		int x=10;
		x*=x+5;
		//x*--->10
		//x+5---> 10+5=15;
		//x= x*(10+5);
		System.out.println(x);
		
		
	}

}
