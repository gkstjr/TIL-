package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/* 	
 *   dp[n] = n인 계단 수의 경우의 수
 *	 dp[n][i] = dp[n - 1][i - 1] + dp[n - 1][i + 1]; 0 <= i <= 9 
 *	 i 가 0 일때는 dp[n] = dp[n - 1][i + 1];
 *	 초기셋팅 - dp[n][i] 에서 n이 1이면 i가 0 일때 뺴고는 전부 1 
*/
public class dp_10844 {
		static long[][] dp;
		static long mod = 1000000000;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new long[n + 1][10];
		
				
		for(int i = 0; i <= 9; i++) {
			if(i == 0) {
				dp[1][i] = 0;
			}else {
				dp[1][i] = 1; 				
			}
 		}
				
		for(int i = 2; i <= n; i++) {
			for(int j = 0; j <= 9; j++) {
				if(j == 0) {
					dp[i][j] = dp[i - 1][j + 1] % mod;
				}else if(j == 9) {
					dp[i][j] = dp[i - 1][j - 1] % mod;
				}else {
					dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod;					
				}
			}
		}
		
		long answer = 0;
		for(int i = 0 ; i <= 9; i++) {
			answer += dp[n][i];
		}
		System.out.println(answer % mod);
	}
	
}
