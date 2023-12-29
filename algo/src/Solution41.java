import java.util.ArrayList;
import java.util.*;

class Solution41 {	
		 public static void main(String[] args) {
	    	Solution41 sol = new Solution41();
//	    	int[] num = {0,1,2,4,3};
	    	int[][] num2 = {{2,3},{0,7},{5,9},{6,10}};
//	    	System.out.println(num[1]);
//	    	System.out.println(sol.solution("rermgorpsam", num2));
	    } 
		 public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
			 	ArrayList<Integer> answer = new ArrayList<Integer>();
			 
		        for(int i = 0 ; i < intStrs.length; i++) {
		        	int num = Integer.parseInt(intStrs[i].substring(s, s + l));
		        	if(num > k) {
		        		answer.add(num);
		        	}
		        }
		        return answer;
		    }
}
