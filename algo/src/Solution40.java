import java.util.ArrayList;
import java.util.Arrays;

class Solution40 {	
		 public static void main(String[] args) {
	    	Solution40 sol = new Solution40();
//	    	int[] num = {0,1,2,4,3};
	    	int[][] num2 = {{2,3},{0,7},{5,9},{6,10}};
//	    	System.out.println(num[1]);
	    	System.out.println(sol.solution("rermgorpsam", num2));
	    } 
		  public String solution(String my_string, int[][] queries) {
		        String answer = "";
		        String[] str = my_string.split(""); 
		        for(int i = 0 ; i < queries.length; i++) {
		        	int s = queries[i][0];
		        	int e = queries[i][1];
		        	
		        	while(s < e) {
		        		String temp = str[s];
		        		str[s] = str[e];
		        		str[e] = temp;
		        		s++;
		        		e--;
		        	}
		        		
		        }
		        for(int i = 0 ; i < str.length; i++) {
		        	answer += str[i];
		        }
		        return answer;
		    }
}
