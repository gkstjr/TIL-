package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/* 	
 	dp[n] = dp[n - i * i] + 1 의 i를 범위내로 돌려서 최솟값; 
	초기셋팅 (범위)
	1 <= i * i <= n;
*/
 public class dp_1699 {	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			//최솟값을 비교해서 구해야 하니 초기값을 최대로 나올 수있는 값을 셋팅해주면 편함
			dp[i] = i;
			for(int j = 1; j * j <= i; j++) {
				dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
			}
		}
		
		System.out.println(dp[n]);
	}

}
