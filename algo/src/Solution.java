class Solution {
	class Solution {
	    public int[] solution(String s) {
	        int[] answerArr = new int[123];
	        
	        for(int i = 0; i < answerArr.length; i++) {
	            answerArr[i] = -1;
	        } 
	        
	        char[] arr = s.toCharArray();
	        int[] answer = new int[arr.length];
	        
	       for(int i = 0; i < arr.length; i++) {
	            if(answerArr[arr[i]] == -1) {
	                answer[i] = -1;
	                answerArr[arr[i]] = i;
	            }else {
	                answer[i] = i - answerArr[arr[i]] ;
	                answerArr[arr[i]] = i;

	            }
	       }
	        
	        return answer;
	    }
	}
}