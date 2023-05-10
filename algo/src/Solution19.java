class Solution19 {	
	//	 public static void main(String[] args) {
//	    	Solution sol = new Solution();
//	    	System.out.println(sol.solution("<","=",20,50));
//	    } 
	public int solution(int a, int b, boolean flag) {
		        int answer = 0;
		        
		        if(flag) {
		        	answer = a + b;
		        }else {
		        	answer = a - b;
		        }
		        return answer;
	}
}