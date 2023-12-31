import java.util.ArrayList;
import java.util.List;

class Solution38 {	
//		 public static void main(String[] args) {
//	    	Solution sol = new Solution();
////	    	int[] num = {0,1,2,4,3};
////	    	int[][] num2 = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
//	    	int l = 5;
//	    	int r = 555;
////	    	System.out.println(num[1]);
//	    	System.out.println(sol.solution(l,r)[5]);
//	    } 
	 public String solution(String my_string, int[] index_list) {
	        String answer = "";
	        String[] str = my_string.split("");
	        
	        for(int i = 0 ; i < index_list.length; i++) {
	        	answer += str[index_list[i]];
	        }
	        
	        return answer;
	    }
}
