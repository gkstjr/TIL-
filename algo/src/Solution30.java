class Solution30 {	
//		 public static void main(String[] args) {
//	    	Solution sol = new Solution();
//	    	int[] num = {0,1,2,4,3};
//	    	int[][] num2 = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
//	    	
////	    	System.out.println(num[1]);
//	    	System.out.println(sol.solution(num,num2));
//	    } 
		
	public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        
        for(int i = 0; i < queries.length; i++) {
        	int s = queries[i][0];
        	int e = queries[i][1];
        	int k = queries[i][2];
        	
        	for(int j = s; j <= e; j++) {
        		if(j % k == 0) {
        			answer[j] += 1; 
        		}
        	}
        }
        return answer;
    }
}