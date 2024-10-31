package programmers.book.backTracking;
import java.util.*;

public class back_basic {
	static int N;
	
	public static void main(String[] args) {
		solution(7);
	}

	public static void solution(int n) {
		N = n;
	
		back(0 , 1 , new ArrayList<Integer>());
	}
	
	public static void back(int sum , int choice , ArrayList<Integer> answer) {
//		System.out.println(sum +" / "  + choice);
		if(sum == 10) {
		    ArrayList<Integer> sortedAnswer = new ArrayList<>(answer);
			Collections.sort(sortedAnswer);
			for(int x : sortedAnswer) {
	       
				System.out.print(x + ", ");
			}
			System.out.println();
			return;
		}
		if(sum > 10 || choice > N) return;
	
		
		ArrayList<Integer> now = new ArrayList<>(answer);
		
		now.add(choice);
		
		back(sum + choice , choice + 1 , now);
		back(sum , choice + 1, new ArrayList<>(answer));
		
	}
}
