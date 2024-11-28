package programmers.book.dynamicProgram;
import java.util.*;

public class dp_basic03 {
	public static void main(String[] args) {
		int[][] arr2 = {{1,7,13,2,6},{2,-4,2,5,4},{5,3,5,-3, 1}};
		int[][] arr = {{1,3,3,2},{2,1,4,1},{1,5,2,3}};
		
		int N = arr[0].length;
		int[][] dp = new int[4][N];
		
		dp[0][0] = arr[0][0];
		dp[1][0] = arr[1][0];
		dp[2][0] = arr[2][0];
		dp[3][0] = arr[0][0] + arr[2][0];
		System.out.println(dp[0][0] + " / " + dp[1][0] + " / " + dp[2][0] + " / " + dp[3][0]);

		
		for(int i = 1; i < N; i++) {
			dp[0][i] = Math.max(dp[1][i - 1], dp[2][i - 1]) + arr[0][i];
			dp[1][i] = dp[3][i - 1] + arr[1][i];
			dp[2][i] = Math.max(dp[0][i - 1], dp[1][i - 1]) + arr[2][i];
			dp[3][i] = dp[1][i - 1] + arr[0][i] + arr[2][i]; 
			
			System.out.println(dp[0][i] + " / " + dp[1][i] + " / " + dp[2][i] + " / " + dp[3][i]);
		}
		
		int answer = Math.max(dp[0][N - 1], dp[1][N - 1]);
		answer = Math.max(answer, dp[2][N - 1]);
		answer = Math.max(dp[3][N - 1], answer);
		
		System.out.println(answer);
					
	}

	public static int[] solution(int[] arr) {
		
		
		return arr;
	}
}
