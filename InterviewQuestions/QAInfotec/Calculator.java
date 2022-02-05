package QAInfotec;

public class Calculator {
	
	public Integer add(String a, String b) throws Exception{
		Boolean numeric=true;
		Object result=null;
		Integer a1=null,b1=null;
		try {
		 a1 = Integer.parseInt(a);
		 b1 = Integer.parseInt(b);
		}
		catch(NumberFormatException e) {
			numeric=false;
			
		}
		
		if(numeric) {
			result= a1+b1;
		}
		else
			System.out.println("Number is not numeric");
		
		return (Integer) result;
		
	}
	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		try {			
		Integer result = cal.add("ass", "ssd");
		System.out.println(result);
		}
		catch(NumberFormatException e) {
			System.out.println("Number Format Exception isoccured");
			e.getStackTrace();
		}
        catch(Exception e) {
			
		}
	}
	

}
