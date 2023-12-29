import java.util.ArrayList;

class Solution31 {	
		 public static void main(String[] args) {
	    	Solution31 sol = new Solution31();
//	    	int[] num = {0,1,2,4,3};
//	    	int[][] num2 = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
	    	int l = 5;
	    	int r = 555;
//	    	System.out.println(num[1]);
	    	System.out.println(sol.solution(l,r)[5]);
	    } 
		
	 public int[] solution(int l, int r) {
	     ArrayList<Integer> answer = new ArrayList<Integer>();  
	     
	     for(int i = l ; i <= r; i++ ) {
	    	 int n = i;
	    	 while(n > 0) {
	    		 int digit = n % 10;
	    		 if(digit != 0 && digit != 5) {
	    			 break;
	    		 }
	    		 n /= 10;
	    	
	    	 }
	    	
	     }
	     
	     if(answer.isEmpty()) {
	    	 return new int[]{-1};
	     }else {
	    	 return answer.stream().mapToInt(i -> i).toArray();
	     }
	 }

//     private boolean containOnlyFiveAndZero(int n) {
//    	 
//    	 while(n > 0) {
//    		 int digit = n % 10;
//    		 if(digit != 0 && digit != 5) {
//    			 return false;
//    		 }
//    		 n /= 10;
//    	 }
//    	 return true;
//     }
}