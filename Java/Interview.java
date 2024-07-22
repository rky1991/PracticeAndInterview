import java.util.ArrayList;
import java.util.Arrays;

public class Interview {

	public static void main(String[] args) {
		//int[] A = {1,3,4,6,2,1};
		//int[] A = {1,2,3};
		//int[] A = {1,-1};
		int[] A = {-1,-3};
		Interview interview = new Interview();
		Arrays.sort(A);
		ArrayList<Integer> B = new ArrayList<>();
		for (int i=0;i<A.length;i++) {
			if(A[i]>0)
				B.add(A[i]);
		}
		
		
		System.out.println(interview.findInt(B));
		

	}
	
	public int findInt(ArrayList<Integer> A) {
		int num =A.size();
		for (int i=1; i<=num;i++) {
			if(i==A.get(i-1))
				continue;
			else				
				return i;
		}
		return num+1;
	}

}
