package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/* 	
	
	
	이렇게 구하고 3가지 경우중에 가장 작은 수 구하면 됌
*/
public class dp_1309 {	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mod = 9901;
		int n = Integer.parseInt(br.readLine());
		
		long[][] dp = new long[n + 1][3];
		
		dp[1][0] = 1;
		dp[1][1] = 1;
		dp[1][2] = 1;
		
		for(int i = 2; i <= n; i++) {
			dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % mod;
			dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % mod; 
			dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % mod;
		}
		
		long answer = dp[n][0] + dp[n][1] + dp[n][2];
		System.out.println(answer % mod);
	}
}
