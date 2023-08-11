package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

		/* 
		 * 	
		 *  dp[n] = n개의 수열중에서 부분 바이토닉 수열중 가장 긴 바이토닉 수열의 길이
		 * 점화식 dp[n] = 정방향으로 오름차순으로 수열의 길이 l_dp 값 구하고 역방향으로 오름차순 수열의 길이 r_dp 값 구하고 더한 후 - 1 중 가장 큰 값;
		 * 	  
		 * */
public class Day11_11054 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] seq = new int[n + 1];
		int[] l_dp = new int[n + 1];
		int[] r_dp = new int[n + 1];
		int[] dp = new int[n + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 1; i < n + 1; i ++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i < n + 1 ; i++) {
			l_dp[i] = 1;
			for(int j = 1; j < i; j++) {
				if(seq[i] > seq[j]) {
					l_dp[i] = Math.max(l_dp[i], l_dp[j] + 1);
				}
			}
		}
		
		for(int i = n; i >= 1; i--) {
			r_dp[i] = 1; 
			for(int j = n; j > i; j--) {
				if(seq[i] > seq[j]) {
					r_dp[i] = Math.max(r_dp[i], r_dp[j] + 1);
				}
			}
		}
	
		for(int i = 1; i < n + 1; i ++) {
			dp[i] = r_dp[i] + l_dp[i] - 1;
		}
		int max = 0;
		for(int i : dp) {
			max = Math.max(i, max);
		}
		
		System.out.println(max);
	}
}
