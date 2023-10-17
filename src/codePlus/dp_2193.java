package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/* 	
	dp[n] = n자리 이친수의 개수를 구하는 프로그램을 작성 !bottom - top 방식으로 많이해봤으니 top-bottom 방식으로 해보자	
	점화식 -> dp[n][1] = dp[n - 1][0]; 
			dp[n][0] = dp[n - 1][1] + dp[n - 1][0];
			위의 두개를 더하면 dp[n]
			
			초기세팅 - dp[1][0] = 0 , dp[1][1] = 1 
*/
public class dp_2193 {	
	static long[][] dp;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new long[n + 1][2];
		dp[1][1] = 1;
		
		long answer = recur(n,0) + recur(n,1);
		
		System.out.println(answer);
	}
	
	static long recur(int n , int val) {
		if(n == 0) return 0;
		
		if(dp[n][val] == 0) {
			if(val == 1) {
				dp[n][val] = recur(n - 1,0);			
			}else {
				dp[n][val] = recur(n - 1,1) + recur(n - 1,0);
			}
		}
		
		return dp[n][val];
	}
}
