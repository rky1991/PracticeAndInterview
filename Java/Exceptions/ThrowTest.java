package Exceptions;


public class ThrowTest {
	
	
	public static void main(String[] args) throws TestThrow {
		System.out.println("hello world");
		if(10<20) {
			throw new TestThrow();
		}
		
		System.out.println("main end");
	}

}
