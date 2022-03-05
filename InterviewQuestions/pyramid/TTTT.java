package pyramid;

public class TTTT {

}


import java.awt.print.Book;
//1.	Write a Java program to calculate the total price of each book where book name 
//is unique. The basic code is given below.
import java.io.*;
import java.util.*;

class javaQ {
	public static void main (String[] args) {
  
  //ystem.out.println("Hello Java");
  Book  prod1 = new Book ();
  Book  prod2 = new Book ("Learn PHP",213.50, 3);
  Book  prod3 = new Book ("ReactJS for Dummies",320, 8);
  Book  prod4 = new Book ("Java Programming",520, 5);
  Book  prod5 = new Book ("ReactJS for Dummies",320, 7);
  Book  prod6 = new Book ("ANSI C",222, 5);
  List<Book > myList = new ArrayList<Book >();
  myList.add(prod1);
  myList.add(prod2);
  myList.add(prod3);
  myList.add(prod4);
  myList.add(prod5);
  myList.add(prod6);
  
  
  System.out.println(myList);
 
}
}

public class Book1 {
private String name;
private int quantity;
private double unit_price;

public Book (String name, double price, int quantity) {
  this.name=name;
  this.unit_price=price;
  this.quantity=quantity;
}

public String getName() {
		return name;
  
	}

public double getPrice() {
		return unit_price;
	}

public int getInt() {
		return quantity;
	}
}

/* 
Expected Output
Total Selling price for Java Programming is 3640
Total Selling price for Learn PH is 640.50
Total Selling price for ReactJS for Dummies is 4800
Total Selling price for ANSI C is 1110

*/






























/*
class product1{
	public String product_name;
}

public class product{
	
	public static void main(String args[])
	{
		finally {

		 	System.out.println("Thank you");
		}
		final product1 p1 = new product1();
		
		product1 p2 = new product1();
		p1 = p2;

		p1.product_name = "iPhoneX";
		System.out.println(p1.product_name);
		
		p1.product_name = "Samsung Note";

		System.out.println(p1.product_name);


	}
}
*/


/*
class myClass{
	public static String str = "";
	public String name = "";
}

public class myJavaClass{
	
	public static void main(String args[])
	{
		myClass m1 = new myClass();
		myClass m2 = new myClass();

		m1.str = "Java";
		m2.str = "Python";
		myClass.str = "Visual Basic";

		System.out.println(m1.str);		// Java
	}
}
*/
