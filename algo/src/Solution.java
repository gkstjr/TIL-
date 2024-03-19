import java.util.*;

class Solution {
	public static void main(String[] args) {
		Solution sol = new Solution();
	    	int[] num = {0,1,2,4,3};
		int[][] num2 = { { 2, 3 }, { 0, 7 }, { 5, 9 }, { 6, 10 } };
//	    	System.out.println(num[1]);
//	    	System.out.println(sol.solution("rermgorpsam", num2));
	}

	  public List<Integer> solution(int []arr) {
		  ArrayList<Integer> answer = new ArrayList<Integer>();
		  
		  Queue<Integer> que = new LinkedList<Integer>();
	                         
	        for(int i = 0; i < arr.length; i++) {
	        	if(que.peek() != arr[i]) {
	        		que.offer(arr[i]);                       
	        	}
	        }
	        
	        while(!que.isEmpty()) {
	        	answer.add(que.poll());
	        }
	        
	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println("Hello Java");
	        
	        return answer;
	    }
}
