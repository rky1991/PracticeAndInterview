package interviewprograms;

public class ReverseNumber {
	 
	public static void reverseNo(int num) {
		int revN=0,rem=0;
		while(num!=0) {
		rem=num%10;
		revN=revN*10+rem;
		num=num/10;
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
