package programmers.book.simulation;
import java.util.*;

public class simul_basic4 {
	public static void main(String[] args) {
		
		
	}

	 public int[] solution(int brown, int yellow) {
	        int[] answer = {};
	        
	        int totalSize = brown + yellow;
	        int maxVertical = (int)(Math.sqrt(totalSize));

	        for(int i = 3; i <= maxVertical; i++) {
	                
	            if(totalSize % i == 0) {
	                int horizontal = (int)(totalSize / i);
	                
	                int expectBrown = (horizontal + i) * 2 - 4;
	                
	                if(expectBrown == brown) return new int[]{horizontal , i};
	            }
	        }
	        return answer;
	    }
}
