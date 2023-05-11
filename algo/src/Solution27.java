class Solution27 {	
//		 public static void main(String[] args) {
//	    	Solution sol = new Solution();
//	    	int[] num = {2,1,6};
//	    	System.out.println(num[1]);
//	    	System.out.println(sol.solution(num)[3]);
//	    } 
//		
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int i = 0 ; i < queries.length; i++) {
        	int num1 = queries[i][0];
        	int num2 = queries[i][1];
        	
        	int temp = arr[num1];
        	arr[num1] = arr[num2];
        	arr[num2] = temp;
        }
        answer = arr.clone();
        return answer;
    }
}