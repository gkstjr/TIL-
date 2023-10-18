package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/* 	
	dp[i] = dp[i - 1] + A[i] 와 A[i] 더 큰 값
	위에dp[i]는 i의 수일때의 연속합의 큰 수를 말하는 거기 때문에 전체에서 가장 큰 연속합은 마지막에 찾아야 함 
*/
 public class dp_1912 {	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n + 1];
		int[] seq = new int[n + 1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i <= n; i++) {
			
			dp[i] = Math.max(dp[i - 1] + seq[i] , seq[i]);
		}
		int answer = -1000;	
		for(int i = 1; i <= n; i++) {
			answer = Math.max(dp[i], answer);
		}
		
		System.out.println(answer);
	}

}
