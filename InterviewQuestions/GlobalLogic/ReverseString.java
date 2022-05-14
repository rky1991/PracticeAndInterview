package GlobalLogic;

public class ReverseString {
	
	
	public static void main(String[] args) {
		
		String str= "Neha";
		char ch[]=str.toCharArray();
		String st="";
		
		for(int i=ch.length-1;i>=0;i--) {
			st=st+ch[i];
		}
		System.out.println(st);
		
	}

}
