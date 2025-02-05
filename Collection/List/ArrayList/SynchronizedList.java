package List.ArrayList;
import java.util.*;

public class SynchronizedList {
	
	// Java program to demonstrate working of
	// Collections.synchronizedList

		public static void main (String[] args)
		{
			List<String> list =
			Collections.synchronizedList(new ArrayList<String>());

			list.add("practice");
			list.add("code");
			list.add("quiz");

			synchronized(list)
			{
				// must be in synchronized block
				Iterator it = list.iterator();

				while (it.hasNext())
					System.out.println(it.next());
			}
		}
	


}
