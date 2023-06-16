import java.util.ArrayList;
import java.util.*;

class Solution {
	public static void main(String[] args) {
		Solution sol = new Solution();
	    	int[] num = {0,1,2,4,3};
		int[][] num2 = { { 2, 3 }, { 0, 7 }, { 5, 9 }, { 6, 10 } };
	    	System.out.println(num[1]);
	    	System.out.println(sol.solution("rermgorpsam", num2));
	}

	public int solution(String my_string, String is_suffix) {
		String[] answer = new String[my_string.length()];
		int cnt = 0;
		for (int i = 0; i < my_string.length(); i++) {
			answer[i] = my_string.substring(i, my_string.length());
			if (answer[i].equals(is_suffix)) {
				cnt = 1;
			}
		}
		return cnt;
	}
}
