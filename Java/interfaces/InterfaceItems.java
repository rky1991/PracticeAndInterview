package interfaces;

import groovyjarjarantlr4.v4.parse.ANTLRParser.finallyClause_return;

public interface InterfaceItems {
	
	//Non Static abstract method
	void t1();
	//static final variable
	static final int i=10;
	//static concrete method 
	static void test() {
		System.out.println("Static method inside interface");
	}
	//Default method 
	void defalut(); 
	

}
