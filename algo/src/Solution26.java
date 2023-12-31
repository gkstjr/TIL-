class Solution26 {	
//		 public static void main(String[] args) {
//	    	Solution sol = new Solution();
//	    	int[] num = {2,1,6};
//	    	System.out.println(num[1]);
//	    	System.out.println(sol.solution(num)[3]);
//	    } 
//		
	public String solution(int[] numLog) {
        String answer = "";
        
        for(int i = 0 ; i <numLog.length - 1; i++) {
        	int num = numLog[i] - numLog[i+1];
        	
        	switch(num) {
        		case -1 :
        			answer += "w";
        			break;
        		case 1 :
        			answer += "s";
        			break;
        		case -10 : 
        			answer += "d";
        			break;
        		case 10 :
        			answer += "a";
        			break;
        	}
        }
        return answer;
    }
}