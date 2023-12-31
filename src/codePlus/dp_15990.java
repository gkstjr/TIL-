package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/* 
	dp[n] = 정수 n 을 1, 2 , 3 의 합으로 나타내는 방법의 수 
	dp[n][1] = dp[n - 1][2] + dp[n - 1][3]; n = 1 -> 1 and n < 1 때 0
	dp[n][2] = dp[n - 2][1] + dp[n - 2][3]; n = 2 -> 1 and 
	dp[n][3] = dp[n - 3][1] + dp[n - 3][2];
	
*/
public class dp_15990 {
	static long[][] dp;
	static long mod = 1000000009;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
			
			dp = new long[100001][4];
			
			for(int i = 1; i <= 100000; i++) {
				if(i == 1) dp[i][1] = 1;
				if(i == 2) dp[i][2] = 1;
				if(i == 3) dp[i][3] = 1;
				if(i > 1) {
					dp[i][1] = dp[i - 1][2] + dp[i - 1][3] % mod;
				}
				if(i > 2) {
					dp[i][2] = dp[i - 2][1] + dp[i - 2][3] % mod;
				}
				if(i > 3) {
					dp[i][3] = dp[i - 3][1] + dp[i - 3][2] % mod;
				}	
			}
			
			
			for(int T = 0; T < t; T++) {
				int n = Integer.parseInt(br.readLine());
				long answer = 0;
				
				for(int i = 1; i <= 3; i++) {
				answer += dp[n][i];
				}
				
				sb.append(answer % mod).append("\n");
			}
		
		System.out.println(sb);
		
	}
}
