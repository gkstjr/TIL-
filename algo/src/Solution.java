import java.util.ArrayList;

class Solution {
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