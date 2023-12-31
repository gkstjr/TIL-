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
		 *  dp[n] = n의 정수까지의 연속값의 합에 최대값
		 *  	  
		 * */
public class Day11_1912 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] seq = new int[n + 1];
		int[] dp = new int[n + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 1; i < n + 1; i ++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		dp[0] = -1001;
		for(int i = 1; i < n + 1; i++) {
				dp[i] = Math.max(seq[i] + dp[i - 1],seq[i]);			
		}
		
		int max = Integer.MIN_VALUE;
		for(int i : dp) {
			max = Math.max(i, max);
		}
		
		System.out.println(max);
	}
}
