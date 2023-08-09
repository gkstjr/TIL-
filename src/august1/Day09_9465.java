package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

		/* 
		 * dp[1 , 2][n] n열까지의 수들ㅇ의 최댓값
		 *   
		 * */
public class Day09_9465 {
	static int[][] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for(int t = 0 ; t < T; t++) {
			int n = Integer.parseInt(br.readLine());
			dp = new int[3][n + 1];
			
			int[][] arr = new int[3][n + 1];
			for(int i = 1 ; i < arr.length; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 1; j < arr[i].length; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			dp[1][1] = arr[1][1];
			dp[2][1] = arr[2][1];
		
			
			for(int i = 2; i <= n; i++) {
				dp[1][i] = Math.max(dp[2][i - 1], dp[2][i - 2]) + arr[1][i];
				dp[2][i] = Math.max(dp[1][i - 1], dp[1][i - 2]) + arr[2][i];
			}
			System.out.println(Math.max(dp[1][n], dp[2][n]));
		}
		
			
	}
}
