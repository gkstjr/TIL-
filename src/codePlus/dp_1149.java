package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/* 	
	마지막이 빨강 dp[n][0] = min(dp[n - 1][1] + rgb[n][0],dp[n - 1][2] + rgb[n][0]);
	마지막이 초록 dp[n][1] = min(dp[n - 1][0] + rgb[n][1],dp[n - 1][2] + rgb[n][1]);
	마지막이 파랑 dp[n][2] = min(dp[n - 1][0] + rgb[n][2] , dp[n - 1][1] + rgb[n][2]);  
	
	이렇게 구하고 3가지 경우중에 가장 작은 수 구하면 됌
*/
public class dp_1149 {	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] dp = new int[n + 1][3];
		int[][] rgb  = new int[n + 1][3];
		for(int i = 1 ; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j <= 2; j++) {
				rgb[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}
		
		for(int i = 1; i <= n; i++) {
			dp[i][0] = Math.min(dp[i - 1][1] + rgb[i][0], dp[i - 1][2] + rgb[i][0]);
			dp[i][1] = Math.min(dp[i - 1][0] + rgb[i][1] ,dp[i - 1][2] + rgb[i][1]);
			dp[i][2] = Math.min(dp[i - 1][0] + rgb[i][2] , dp[i - 1][1] + rgb[i][2]);
		}
		
		int answer = Math.min(Math.min(dp[n][0], dp[n][1]),dp[n][2]);
		System.out.println(answer);
	}
}
