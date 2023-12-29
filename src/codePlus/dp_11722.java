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
 public class dp_11722 {	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n + 1];
		int[] seq = new int[n + 1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = n; i >= 1; i--) {
			dp[i] = 1;
			for(int j = i + 1; j <= n; j++) {
				if(seq[j] < seq[i] && dp[j] + 1 > dp[i]) {
					dp[i] = dp[j] + 1;
				}
			}
		}
		
		int answer = 0;
		
		for(int i = 1; i <=n ; i++) {
			answer = Math.max(dp[i], answer);
		}
		
		System.out.println(answer);
	}

}
