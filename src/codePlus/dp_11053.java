package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/* 	
	
*/
public class dp_11053 {	
	static int[] dp;
	static int[] A;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new int[n + 1];
		A = new int[n + 1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 1 ; i < A.length; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i <= n; i++) {
			dp[i] = 1;
			for(int j = 1; j<= i - 1; j++) {
				if(dp[j] + 1 > dp[i] && A[j] < A[i]) {
					dp[i] = dp[j] + 1;
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
