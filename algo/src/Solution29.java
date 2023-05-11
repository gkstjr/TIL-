class Solution29 {	
//		 public static void main(String[] args) {
//	    	Solution sol = new Solution();
//	    	int[] num = {0,1,2,4,3};
//	    	int[][] num2 = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
//	    	
////	    	System.out.println(num[1]);
//	    	System.out.println(sol.solution(num,num2));
//	    } 
		
	public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0 ; i < queries.length; i++) {
        	int s = queries[i][0];
        	int e = queries[i][1];
        	int k = queries[i][2];
        	int min = Integer.MAX_VALUE;
        	for(int j = s; j <= e; j++) {
        		if((min > arr[j]) && arr[j] > k) {
        			min = arr[j];
        		}
        	}
        	if(min > 2000000) min = -1;
        	answer[i] = min;
        	System.out.println(min);
        }
        return answer;
    }
}