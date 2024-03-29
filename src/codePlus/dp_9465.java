package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/* 	
	dp[n][0] = dp[n - 1][0] , dp[n - 1][1] , dp[n - 1][2] 중에 최댓;
	dp[n][1] = dp[n - 1][0] + seq[1][n]  , dp[n - 1][2] + seq[1][n] 중에 최댓값;
	dp[n][2] = dp[n - 1][0] + seq[2][n] , dp[n - 1][1] + seq[2][n] 중에 최댓값;
	
	세가지 값중에 최댓값을 구할 것
*/
 public class dp_9465 {	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int t = 0; t < T; t++) {
			int n = Integer.parseInt(br.readLine());
			
			int[][] dp = new int[n + 1][3];
			int[][] seq = new int[3][n + 1];
			
			
			for(int i = 1 ; i < 3; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 1; j <= n; j++) {
					seq[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			dp[1][1] = seq[1][1];
			dp[1][2] = seq[2][1];
			
			for(int i = 2; i <= n; i++) {
				dp[i][0] = Math.max(Math.max(dp[i - 1][0] , dp[i - 1][1]), dp[i - 1][2]);
				dp[i][1] = Math.max(dp[i - 1][0] + seq[1][i], dp[i - 1][2] + seq[1][i]);
				dp[i][2] = Math.max(dp[i - 1][0] + seq[2][i], dp[i - 1][1] + seq[2][i]);
			}
			int answer = Math.max(Math.max(dp[n][0], dp[n][1]),dp[n][2]);
			
			sb.append(answer).append("\n");
		}
		System.out.println(sb);
	}

}
