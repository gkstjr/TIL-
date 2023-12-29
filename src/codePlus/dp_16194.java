package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/* 
	dp[n] = dp[n - i] + p[i] 를 반복해서 최솟값 찾기  1 <= i <= n;
*/
public class dp_16194 {
		static int[] dp;
		static int[] p;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new int[n + 1];
		p = new int[n + 1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int min = 1000 * 10000;
		
		
		for(int i = 1; i <= n; i++) {
			p[i] = Integer.parseInt(st.nextToken());
			dp[i] = min;
		}
				
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				dp[i] = Math.min(dp[i], dp[i - j] + p[j]);
			}
		}
		
		System.out.println(dp[n]);
	}
	
}
