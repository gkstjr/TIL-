package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/* 	
 	dp[n]은 n의 정수를 1 , 2 , 3 의 합으로 나타내는 방법의 수
 	dp[n] = dp[n - 1] + dp[n - 2] + dp[n - 3]; 
 	초기셋팅 (범위)
 	dp[0] = 1;
	n == 1 -> dp[n] = dp[n - 1];
	n == 2 -> dp[n] = dp[n - 1] + dp[n - 2];
	n >= 3 -> dp[n] = dp[n - 1] + dp[n - 2] + dp[n - 3];
*/
 public class dp_2225 {	
	//bottom - top 형식 많이 했으니 top- bottom형식으로 풀자 -> 근데 재귀로 하니까 스택오버플로우가 나온다.. 스택에 쌓이는 부분이 뎁스가 커지는 걸 고려하지 못했다..
	static int[] dp;
	static int mod = 1000000009;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		dp = new int[1000001];
		dp[0] = 1;
		recur(1000000);
		
		for(int t = 0 ; t < T; t++) {
			int n = Integer.parseInt(br.readLine());
			
			sb.append(dp[n] % mod).append("\n");
			
		}
		System.out.println(sb);
		
	}
	static void recur(int n) {
		
		for(int i = 1; i <= n; i++) {
			if(i == 1) dp[i] = dp[i - 1] % mod;
			else if(i == 2) dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
			else dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % mod;
		}
		
	}
}
