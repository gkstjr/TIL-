import java.util.ArrayList;
import java.util.*;

class Solution43 {	
		 public static void main(String[] args) {
	    	Solution43 sol = new Solution43();
//	    	int[] num = {0,1,2,4,3};
	    	int[][] num2 = {{2,3},{0,7},{5,9},{6,10}};
//	    	System.out.println(num[1]);
//	    	System.out.println(sol.solution("rermgorpsam", num2));
	    } 
		 public String solution(String my_string, int n) {
		        String answer = "";
		        
		        answer = my_string.substring(my_string.length() - n , my_string.length());
		        
		        return answer;
		    }
}
