package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

		/* 
		 * dp[n]  = n개의 포도주에서 마실 수 있는 최대의 양
		 * 점화식
		 * dp[n] = dp[n - 2] , (dp[n - 3] + arr[n - 1]) 둘중의 더 큰 값에 + arr[n]   
		 * */
public class Day09_2156 {
	static int[] dp;
	static int[] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		dp = new int[10001];
		arr = new int[10001];
		
		for(int i = 1 ; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		dp[1] = arr[1];
		dp[2] = arr[1] + arr[2];
		
		for(int i = 3; i <= n; i++) {
			dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + arr[i] ,(dp[i - 3] + arr[i - 1] + arr[i]))); 
		}
		
		
		System.out.println(dp[n]);
	}
}
