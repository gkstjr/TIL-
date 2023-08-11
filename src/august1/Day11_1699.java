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
public class Day11_1699 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n + 1];
		
		for(int i = 1; i < n + 1 ; i++) {
			
			int square = 0;
			
			for(int j = 1; j * j <=i; j++ ) {
				if(j * j <= i) {
					square = j;
					square = Math.max(j, square);
				}
			}
			
			dp[i] = 1 + dp[(i - square * square)];
		}
		
		System.out.println(dp[n]);
	}	
}
