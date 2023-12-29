import java.util.ArrayList;
import java.util.List;

class Solution34 {	
//		 public static void main(String[] args) {
//	    	Solution sol = new Solution();
////	    	int[] num = {0,1,2,4,3};
////	    	int[][] num2 = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
//	    	int l = 5;
//	    	int r = 555;
////	    	System.out.println(num[1]);
//	    	System.out.println(sol.solution(l,r)[5]);
//	    } 
		
	 public List<Integer> solution(int[] arr) {
		 List<Integer> answer = new ArrayList<Integer>();
		 int i = 0;
		 while(i < arr.length) {
			 if(answer.isEmpty()) {
				 answer.add(arr[i]);
				 i++;
			 }else if(!answer.isEmpty() && answer.get(answer.size()-1) < arr[i]) {
				 answer.add(arr[i]);
				 i++;
			 }else if(!answer.isEmpty() && answer.get(answer.size()-1) >= arr[i]) {
				 answer.remove(answer.size()-1);
			 }
		 }
		 return answer;
	 
	 }
}