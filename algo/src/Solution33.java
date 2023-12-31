import java.util.ArrayList;
import java.util.List;

class Solution33 {	
//		 public static void main(String[] args) {
//	    	Solution sol = new Solution();
////	    	int[] num = {0,1,2,4,3};
////	    	int[][] num2 = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
//	    	int l = 5;
//	    	int r = 555;
////	    	System.out.println(num[1]);
//	    	System.out.println(sol.solution(l,r)[5]);
//	    } 
		
	 public List<Integer> solution(int n) {
	        List<Integer> answer = new ArrayList<Integer>();
	        answer.add(n);
	        while(n != 1) {
	        	if(n % 2 ==0) {
	        		//짝수일 때
	        		n /= 2;
	        	}else {
	        		//홀수 
	        		n = 3 * n + 1;
	        	}
	        	
	        	answer.add(n);
	        }
	        return answer;
	    }
}