import java.util.ArrayList;
import java.util.List;

class Solution35 {	
//		 public static void main(String[] args) {
//	    	Solution sol = new Solution();
////	    	int[] num = {0,1,2,4,3};
////	    	int[][] num2 = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
//	    	int l = 5;
//	    	int r = 555;
////	    	System.out.println(num[1]);
//	    	System.out.println(sol.solution(l,r)[5]);
//	    } 
		
	
	  public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
	        boolean answer = true;
	        boolean answer2 = true;
	        
	        if(x1 == false  && x2 == false) {
	        	answer = false;
	        }else {
	        	answer = true;
	        }

	        if(x3 == false  && x4 == false) {
	        	answer2 = false;
	        }else {
	        	answer2 = true;
	        }
	        
	        if(answer == true && answer2 == true) {
	        return true;
	    }	else {
	    	return false;
	    }
}
}