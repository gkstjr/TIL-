class Solution22 {	
//		 public static void main(String[] args) {
//	    	Solution sol = new Solution();
//	    	System.out.println(sol.solution(3,4));
//	    } 
	 public int solution(int[] num_list) {
	        int answer = 0;
	        int mul = 1;
	        int sum = 0;
	        
	        for(int i = 0 ; i < num_list.length; i++) {
	        	mul *= num_list[i];
	        	sum += num_list[i];
	        }
	        
	        if(mul < sum * sum) answer = 1;
	        else answer = 0;
	        
	        return answer;
	    }
}