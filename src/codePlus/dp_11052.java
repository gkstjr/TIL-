package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/* 
	dp[n] = 카드 n개를 갖기위한 지불해야 하는 최댓값
	점화식 -> dp[n] = math(dp[n-i] + p[i]) 를 1 부터 n까지 반복하여 구함
*/
public class dp_11052 {
	static int[] dp;
	static int[] p;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		dp = new int[n + 1];
		p = new int[n + 1];
		
		
		for(int i = 1 ; i < n + 1; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[1] = p[1];
		
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j <= i; j++) {
				dp[i] = Math.max(dp[i], dp[i - j] + p[j]);
			}
		}
		System.out.println(dp[n]);
	}
}
