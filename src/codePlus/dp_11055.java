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
 public class dp_11055 {	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] dp = new int[n + 1];
		int[] seq = new int[n + 1];
		
		for(int i = 1; i <=n; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i<=n; i++) {
			dp[i] = seq[i];
			for(int j = 1; j < i; j++) {
				if(seq[j] < seq[i] && dp[j] + seq[i] > dp[i]) {
					dp[i] = dp[j] + seq[i];
				}
			}
		}
		
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			answer = Math.max(dp[i],answer);
		}
		System.out.println(answer);
	}

}
