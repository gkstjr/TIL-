import java.util.ArrayList;

class Solution32 {	
//		 public static void main(String[] args) {
//	    	Solution sol = new Solution();
////	    	int[] num = {0,1,2,4,3};
////	    	int[][] num2 = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
//	    	int l = 5;
//	    	int r = 555;
////	    	System.out.println(num[1]);
//	    	System.out.println(sol.solution(l,r)[5]);
//	    } 
		
	public int[] solution(int start, int end) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for(int i = start; i <= end; i++) {
			answer.add(i);
		}
		return answer.stream().mapToInt(i -> i).toArray();
    }
}