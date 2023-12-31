class Solution18 {	
	
	 public static void main(String[] args) {
	    	Solution18 sol = new Solution18();
	    	System.out.println(sol.solution("<","=",20,50));
	    }
	 
	 public int solution(String ineq, String eq, int n, int m) {
	        int answer = 0;
	        
	        if(ineq.equals(">")) { // > 일 때
	        	if(eq.equals("=")) {
	        		if(n >= m) answer = 1;
	        		else answer = 0;
	        	}else {
	        		if(n > m) answer = 1;
	        		else answer = 0;
	        	}
	        }else { // < 일떄
	        	if(eq.equals("=")) {
	        		if(n <= m) answer = 1;
	        		else answer = 0;
	        	}else {
	        		if(n < m) answer = 1;
	        		else answer = 0;
	        	}
	        }
	        return answer;
	        
	    }
    
   
}