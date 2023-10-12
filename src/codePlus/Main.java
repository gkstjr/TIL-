package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/* 
	dp[n] = 정수 n 을 1, 2 , 3 의 합으로 나타내는 방법의 수 
	점화식 -> dp[n] = dp[n - 1] + dp[n - 2] + dp[n - 3];
*/
public class Main {
	static Integer[] dp;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			dp = new Integer[12];
			dp[1] = 1; dp[2] = 2; dp[3] = 4;
			
			sb.append(recur(n)).append("\n");
		}
		System.out.println(sb);
	}
	
	static int recur(int n) {
		if(dp[n] == null) {
			dp[n] = recur(n - 1) + recur(n - 2) + recur(n - 3);
		}
		
		return dp[n];
	}

}
