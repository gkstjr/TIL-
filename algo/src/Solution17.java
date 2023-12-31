class Solution17 {	
	
	 public static void main(String[] args) {
	    	Solution17 sol = new Solution17();
	    	System.out.println(sol.solution(10));
	    }
	 
    public  int solution(int n) {
        int answer = 0;
        
        //홀수이면
        if(n % 2 != 0) {
        	for(int i = 1 ; i <= n; i+=2) {
        		answer += i;
        	}
        }else {
        	for(int i = 2; i <= n; i+=2) {
        		answer += i * i;
        	}
        }
        	
        return answer;
    }
    
   
}