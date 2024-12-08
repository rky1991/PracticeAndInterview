package sapient;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListCompare {

	// List1=["abc","a","cbvv","b"]
	// List2=["a","b"]
	// List1 vs List2:
	// match the index:
	// O/p: {2,"a"},
	// {4,"b"}

	public static void main(String[] args) {

		List ls = new ArrayList();
		List ls1 = new ArrayList();
		ls.add("abc");
		ls.add("a");
		ls.add("cbvv");
		ls.add("b");
		System.out.println(ls);
		ls1.add("a");
		ls1.add("b");
		System.out.println(ls1);

		Map<String, Integer> mp = new HashMap <String, Integer>();
		for(int i=0;i<ls.size();i++) {
			mp.put(ls.get(i).toString(), i+1 );

		}
		System.out.println(mp);

		for(int i=0; i<ls1.size();i++) {
			String word = ls1.get(i).toString(); 
			Integer index = mp.get(word); 
			if(index!=null) {
				System.out.println("{"+ index +","+ word + "}");
			}

		}


	}




}
