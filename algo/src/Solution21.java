class Solution21 {	
//		 public static void main(String[] args) {
//	    	Solution21 sol = new Solution21();
//	    	System.out.println(sol.solution(3,4));
//	    } 
			    public int solution(int a, int d, boolean[] included) {
			        int answer = 0;
			        int num = a;
			        for(int i = 0; i < included.length; i++) {
			        	 if(i==0) num = a;
			        	 else num += d;
			        	 
			        	 if(included[i] == true) answer += num;
			        }
			        return answer;
			    }
}