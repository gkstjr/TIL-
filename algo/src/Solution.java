import java.util.*;

class Solution {
	public static void main(String[] args) {
		Solution sol = new Solution();
	    	int[] num = {0,1,2,4,3};
		int[][] num2 = { { 2, 3 }, { 0, 7 }, { 5, 9 }, { 6, 10 } };
//	    	System.out.println(num[1]);
//	    	System.out.println(sol.solution("rermgorpsam", num2));
	}

	 public String solution(String s) {
	        String answer = "";
	        String[] str = s.split("");
	        int cnt = 0;
	        
	        for(int i = 0 ; i < str.length; i++) {
	            if(str[i].isEmpty()) {
	                cnt = 0;
	                answer += " ";
	                continue;
	            }    
	            
	            if(cnt % 2 == 0) {
	                answer += str[i].toUpperCase();
	            }else {
	                answer += str[i].toLowerCase();
	            }
	            cnt++;
	        }
	        
	        return answer;
	    }
}
