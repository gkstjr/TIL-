import java.util.ArrayList;
import java.util.*;

class Solution42 {	
		 public static void main(String[] args) {
	    	Solution42 sol = new Solution42();
//	    	int[] num = {0,1,2,4,3};
	    	int[][] num2 = {{2,3},{0,7},{5,9},{6,10}};
//	    	System.out.println(num[1]);
//	    	System.out.println(sol.solution("rermgorpsam", num2));
	    } 
		 public String solution(String[] my_strings, int[][] parts) {
		        String answer = "";
		        for(int i = 0 ; i < parts.length; i++) {
		            int s = parts[i][0];
		            int e = parts[i][1];
		            
		            answer += my_strings[i].substring(s,e+1);
		        }
		        return answer;
		    }
}
