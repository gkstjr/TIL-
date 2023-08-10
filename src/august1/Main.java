package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

		/* 
		 * 	11055번 부분 수열 관련 DP 문
		 *  dp[n] = n개의 수열중에서 부분 증가 수열의 합의 최대값을 뽑아
		 * 점화식 dp[n] = 전 arr 수를 탐색하여 현재 arr[n] 보다 작을 때 해당 수의 dp값 +	arr[n] 값이 최대인 값이 dp[n]이 된다.
		 * 	  
		 * */
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] seq = new int[n + 1];
		int[] dp = new int[n + 1];
		
		for(int i = 1 ; i < n +1; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
  		
		for(int i = 1; i < n + 1 ; i++) {
			dp[i] = seq[i];
			for(int j = i - 1; j >= 1; j--) {
				if(seq[i] > seq[j]) {
					dp[i] = Math.max(dp[i], dp[j] + seq[i]);
				}
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 1; i < n + 1; i++) {
			if(max < dp[i]) {
				max = dp[i];
			}
		}
		System.out.println(max);
	}
}
