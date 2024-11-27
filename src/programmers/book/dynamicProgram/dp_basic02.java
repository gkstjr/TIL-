package programmers.book.dynamicProgram;
import java.util.*;

public class dp_basic02 {
	public static void main(String[] args) {
		int[] nums = {1,4,2,3,1,5,7,3};
		
		int answer = 0;
		
		int[] dp = new int[nums.length];
		
		dp[0] = 1;
		
		for(int i = 2; i < dp.length; i++) {
			int index = 0;
			for(int j = i - 1; j >= 0; j--) {
				if(nums[j] < nums[i] && dp[index] <= dp[j]) {
					index = j;					
					dp[i] = dp[index] + 1;
				}
			}
		}
		
		for(int num : dp) {
			answer = Math.max(num, answer);
		}
		
		System.out.println(answer);
	}

	public static int[] solution(int[] arr) {
		
		
		return arr;
	}
}
