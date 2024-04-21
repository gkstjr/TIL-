import java.util.ArrayList;

class Solution {
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