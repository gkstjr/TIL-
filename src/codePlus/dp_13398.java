package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/* 	
	dp[n] = 
	
	세가지 값중에 최댓값을 구할 것
*/
 public class dp_13398 {	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n + 2];
		int[] dp2 = new int[n + 2];
		int[] seq = new int[n + 1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		//i를 끝으로 하는 연속
		for(int i = 1; i <= n; i++) {
			dp[i] = seq[i];
			if(dp[i - 1] + seq[i] > dp[i]) {
				dp[i] = dp[i - 1] + seq[i];
			}
		}
		
		//i를 시작으로 하는 연속합
		for(int i = n; i >= 1; i--) {
			if(i == n) {
				dp2[i] = seq[i];
				continue;
			}
			dp2[i] = Math.max(dp2[i + 1] + seq[i], seq[i]);
		}
	
		// 제외 안하고 최댓값과 제외 하고 최댓값중에 더 큰 값 찾기
		int answer = dp[1];
		
		for(int i = 1; i <=n; i++) {
			answer = Math.max(dp[i], answer);
		}
		
		for(int i = 2; i <= n; i++) {
			answer = Math.max(dp[i - 1] + dp2[i + 1],answer);
		}
		
		System.out.println(answer);
	}

}
