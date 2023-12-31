class Solution23 {	
//		 public static void main(String[] args) {
//	    	Solution sol = new Solution();
//	    	System.out.println(sol.solution(3,4));
//	    } 
		
	   public int solution(int[] num_list) {
	        int answer = 0;
	        String even = ""; // 짝수
	        String odd = ""; //홀수
	        
	        for(int i = 0; i < num_list.length; i++) {
	        	if(num_list[i] % 2 == 0) {
	        		//짝수 
	        		even += String.valueOf(num_list[i]);
	        	}else odd += String.valueOf(num_list[i]);
	        }
	        
	        answer = Integer.parseInt(even) + Integer.parseInt(odd);
	        
	        return answer;
	    }
}