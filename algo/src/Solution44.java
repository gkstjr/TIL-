import java.util.ArrayList;
import java.util.*;

class Solution44 {	
		 public static void main(String[] args) {
	    	Solution44 sol = new Solution44();
//	    	int[] num = {0,1,2,4,3};
	    	int[][] num2 = {{2,3},{0,7},{5,9},{6,10}};
//	    	System.out.println(num[1]);
//	    	System.out.println(sol.solution("rermgorpsam", num2));
	    } 
		 public String[] solution(String my_string) {
		        String[] answer = new String[my_string.length()];
		        for(int i = 0 ; i < my_string.length(); i++) {
		        	answer[i] = my_string.substring(i,my_string.length());
		        }
		        Arrays.sort(answer);
		        return answer;
		    }
}
