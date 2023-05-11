class Solution20 {	
		 public static void main(String[] args) {
	    	Solution20 sol = new Solution20();
	    	System.out.println(sol.solution("abc1abc1abc"));
	    } 
	  public String solution(String code) {
	        String answer = "";
	        int mode = 0;
	        
	        for(int i = 0 ; i < code.length(); i++) {
	        	if(mode == 0) {// mode가 0일 떄 
	        		if(code.charAt(i) != '1') {
	        			if(i % 2 ==0) {
	        				answer += code.charAt(i);
	        			}
	        		}else {
	        			mode = 1;
	        		}
	        	}else {// mode가 1일 떄 
	        		if(code.charAt(i) != '1') {
	        			if(i % 2 !=0 ) {
	        				answer += code.charAt(i);
	        			}
	        		}else {
	        			mode = 0;
	        		}
	        	}
	        }
	        if(answer.isEmpty()) {
	        	return "EMPTY";
	        }
	        return answer;
	    }
}