package UniCode;

import java.util.ArrayList;
import java.util.List;

/* 
Expected Output
Total Selling price for Java Programming is 3640
Total Selling price for Learn PH is 640.50
Total Selling price for ReactJS for Dummies is 4800
Total Selling price for ANSI C is 1110

*/

public class JavaQ {
	
	public static void main (String[] args) {
		  
		  //ystem.out.println("Hello Java");
		  Book  prod1 = new Book ("Java Programming",520, 2);
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
		  
		  
		  for(int i=0;i<myList.size();i++) {
			  String name  =myList.get(i).getName();
			  double price = myList.get(i).getPrice();
			  int qn = myList.get(i).getInt();
			  int count =1;
			  for(int j=i+1;j<myList.size();j++) {
				  if(myList.get(i).getName().equals(myList.get(j).getName())) {
					  //System.out.println("Duplicate Books are :"+myList.get(j).getName());
					  //System.out.println("Duplicate Books Quantity :"+myList.get(j).getInt());
					  
					  qn=myList.get(j).getInt()+qn;
					 
					  // System.out.println("Total Quantity"+qn); 
					  count++;
				  }
			  }
			  System.out.println("Total Selling price for-> "+name+" is :"+price*qn);
//			  if(count==1 ) {
//			   System.out.println("Total Selling price for-> "+name+" is :"+price*qn);
//			  }
			  
		  }
		  
//		  for(Book bookObj:myList) {
//			 String name= bookObj.getName();
//			 double price = bookObj.getPrice();
//			 int qn = bookObj.getInt();
//			 System.out.println("Total Selling price for-> "+name+" is :"+price*qn);
//		  }
	}

}
