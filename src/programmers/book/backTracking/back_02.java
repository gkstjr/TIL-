package programmers.book.backTracking;
import java.util.*;

public class back_02 {
	   private static int[] arr; // index가 열 , 값이 행
	    private static int N;
	    private static int answer;
	    public int solution(int n) {
	        answer = 0;
	        arr = new int[n];
	        N = n;
	        back(0);
	        return answer;
	    }
	    
	    public static void back(int col) {
	        if(col == N) {
	            answer += 1;
	            return;
	        }
	        
	        for(int i = 0; i < N; i++) {
	            arr[col] = i;
	            
	            if(isPossible(col)) {
	                back(col + 1);
	            }
	        }
	    }
	    
	    private static boolean isPossible(int col) {
	        for(int i = 0 ; i < col; i++) {
	            if(arr[col] == arr[i]) return false;
	        }
	        
	        
	        for(int i = 0 ; i < col; i++ ) {
	            if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])) return false;
	        }
	        return true;
	    }
}
