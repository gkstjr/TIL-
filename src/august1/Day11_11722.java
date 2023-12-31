package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

		/* 
		 * 	
		 *  dp[n] = n개의 수열중에서 부분 감소 수열중 가장 긴 감소수열의 길이
		 * 점화식 dp[n] = 전 arr 수를 탐색하여 현재 arr[n] 보다 클 때 해당 수의 dp값 +	1 값이 dp[n]이 된다.
		 * 	  
		 * */
public class Day11_11722 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] seq = new int[n + 1];
		int[] dp = new int[n + 1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 1; i < n + 1; i ++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i < n + 1; i++) {
			dp[i] = 1;
			
			for(int j = 1; j < i; j++) {
				if(seq[i] < seq[j]) {
					dp[i] = Math.max(dp[j] + 1, dp[i]);
				}
			}
		}
		int max = 0;
		for(int i : dp) {
			max = Math.max(i, max);
		}
		System.out.println(max);
	}
}
