class Solution24 {	
		 public static void main(String[] args) {
	    	Solution24 sol = new Solution24();
	    	int[] num = {2,1,6};
	    	System.out.println(num[1]);
	    	System.out.println(sol.solution(num)[3]);
	    } 
		
	  public int[] solution(int[] num_list) {
	        int[] answer = new int[num_list.length+1];
	        for(int i = 0 ;i < num_list.length; i++) {
	        	answer[i] = num_list[i];
	        }
	        int leng = num_list.length;
	       if(answer[(leng-1)] > answer[(leng - 2)]) {
	    	   answer[leng] = answer[(leng-1)] - answer[(leng - 2)];
	       }else {
	    	   answer[leng] = answer[leng-1] * 2;
	       }
	        return answer;
	    }
}