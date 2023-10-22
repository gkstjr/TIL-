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
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		long[][] dp = new long[k + 1][n + 1];
		dp[0][0] = 1;
		
		for(int i = 1; i <= k; i++) {
			for(int j = 1; j <= n; j++) {
				for(int l = 0; l <= j; l++ ) {
					dp[i][j] += dp[i - 1][j - l];
				}
				dp[i][j] %= 1000000000; 
			}
		}
		
		System.out.println(dp[k][n] % 1000000000);
	}

}
