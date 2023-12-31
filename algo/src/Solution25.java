class Solution25 {	
//		 public static void main(String[] args) {
//	    	Solution sol = new Solution();
//	    	int[] num = {2,1,6};
//	    	System.out.println(num[1]);
//	    	System.out.println(sol.solution(num)[3]);
//	    } 
//		
		 public int solution(int n, String control) {
		        int answer = n;
		        char[] ch = control.toCharArray();
		        
		        for(int i =0 ; i < ch.length; i++) {
		        	switch (ch[i]) {
					case 'w':
						answer += 1;
						break;
					case 's' :
						answer -= 1;
						break;
					case 'd' :
						answer += 10;
						break;
					case 'a' :
						answer -= 10;
						break;
		        }
		    }
		        return answer;
		 }
}