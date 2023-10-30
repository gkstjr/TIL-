package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/* 	
 	dp[k][n] = dp[k - 1][n - i] 의 i의 범위 안에서의 모든 합을 더해야 함
	초기셋팅 (범위)
	0 <= i <= n;
*/
 public class Main {	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] dp = new int[n + 1][n + 1];
		int[][] seq = new int[n + 1][n + 1];
		
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());	
			for(int j = 1; j <=i; j++) {
				seq[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + seq[i][j];
			}
		}
		
		int answer = 0 ;
		for(int i = 1; i <= n; i++) {
			answer = Math.max(answer,dp[n][i]);
		}
		
		System.out.println(answer);
	}

}
