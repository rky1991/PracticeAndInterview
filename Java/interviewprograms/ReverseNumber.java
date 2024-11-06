package interviewprograms;

public class ReverseNumber {
	 
	public static void reverseNo(int num) {
		int revN=0,rem=0;
		while(num!=0) {
		rem=num%10; // Find the remnder
		revN=revN*10+rem; // Multiply the variable reverse by 10 and add remainder into it 
		num=num/10; //divide the number by 10.
		}
		System.out.println(revN);
	}
	
	public static void reverseNoAsString(String num) {
		char[] ch = num.toCharArray();
		String str="";
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("***");
		for(int i=ch.length-1;i>=0;i--) {
			str=str+ch[i];
		}
		System.out.println("****");
		System.out.println(str);
		int revno = Integer.parseInt(str);
		System.out.println(revno);
		
		
	}
	public static void main(String[] args) {
		reverseNo(144234);
		
		//reverseNoAsString("123");
		
		
	}

}
