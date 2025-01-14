package StringBuilder;

//Both are used to create Mutable (Modifiable) Object
public class StringBuffer_StringBuilder {
	
    public static void main(String args[])
    {
        // String Builder methods , Not Thread Safe ,or not synchronized
 
        StringBuilder buffer =new StringBuilder("Tutor");
        System.out.println(buffer);
        //append ()->
        buffer.append(" Joes");
        System.out.println(buffer);
        //insert() -->
        buffer.insert(10," Computer");
        System.out.println(buffer);
        //replace()-->
        buffer.replace(9,11,"@@@");
        System.out.println(buffer);
        //delete()-->>
        buffer.delete(9,11);
        System.out.println(buffer);
        //reverse()-->
        buffer.reverse();
        System.out.println(buffer);
        //------------->>>other methods
        System.out.println(buffer.charAt(2));
        System.out.println(buffer.length());
        System.out.println(buffer.substring(0));
        System.out.println(buffer.substring(0,5));
        buffer.setCharAt(0,'@');
        System.out.println(buffer);
        
        //String Buffer methods ,thread safe , can not use by multiple threads.
 
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());//default 16
        sb.append("Hello");
        System.out.println(sb.capacity());//now 16
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
 
    }
}