package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/* 	
	이렇게 구하고 3가지 경우중에 가장 작은 수 구하면 됌
*/
public class dp_2156 {	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] dp = new int[n + 1][3];
		int[] seq = new int[n + 1];
		
		for(int i = 1; i < n + 1; i++) {
			seq[i] = Integer.parseInt(br.readLine());
		}
		dp[1][0] = 0;
		dp[1][1] = seq[1];
		
		for(int i = 2; i <= n; i++) {
			dp[i][0] = Math.max(Math.max(dp[i - 1][0] , dp[i - 1][1]),dp[i - 1][2]);
			dp[i][1] = dp[i - 1][0] + seq[i];
			dp[i][2] = dp[i - 1][1] + seq[i];
		}
		
		int answer = Math.max(Math.max(dp[n][0], dp[n][1]),dp[n][2]);
		System.out.println(answer);
	}
}
