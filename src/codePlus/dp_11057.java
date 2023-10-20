package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/* 	
	이렇게 구하고 3가지 경우중에 가장 작은 수 구하면 됌
*/
public class dp_11057 {	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int mod = 10007;
		long[][] dp = new long[n + 1][10];
		
		//초기값 설정해야함
		for(int i = 0; i<= 9; i++) {
			dp[1][i] = 1; 
		}
		
		for(int i = 2; i <= n; i++) {
			for(int j = 0; j <=9; j++) {
				for(int k = 0; k <=j; k++) {
					dp[i][j] += dp[i - 1][k];
				}
				dp[i][j] %= mod;
			}
		}
		
		int answer =0;
		for(int i = 0; i <= 9; i++) {
			answer += dp[n][i];
		}
		
		System.out.println(answer % mod);
	}
}
