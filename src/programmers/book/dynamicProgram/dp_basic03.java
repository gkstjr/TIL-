package programmers.book.dynamicProgram;
import java.util.*;

public class dp_basic03 {
	public static void main(String[] args) {
		int[][] arr = {{1,7,13,2,6},{2,-4,2,5 , 4},{5,3,5,-3, 1}};
		int[][] arr2 = {{1,3,3,2},{2,1,4,1},{1,5,2,3}};

		int[][] dp = new int[4][arr[0].length + 1];
		
		
		for(int i = 1; i < arr[0].length + 1; i++) {
			dp[1][i] = Math.max(dp[2][i - 1], dp[3][i - 1]) + arr[0][i - 1];
			dp[2][i] = dp[1][i - 1] + dp[3][i - 1] + arr[1][i - 1];
			dp[3][i] = Math.max(dp[2][i - 1],dp[1][i - 1]) + arr[2][i - 1];
			
			System.out.println(dp[1][i] + " / " + dp[2][i] + " / " + dp[3][i]);
		}
		
		int answer = Integer.MIN_VALUE;
		for(int i = 1; i < arr[0].length + 1; i++) {
			answer = Math.max(answer, dp[1][i]);
			answer = Math.max(answer, dp[2][i]);
			answer = Math.max(answer, dp[3][i]);
		}				
		
		System.out.println(answer);
	}

	public static int[] solution(int[] arr) {
		
		
		return arr;
	}
}
