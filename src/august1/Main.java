package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

		/* 
		 *  n - 1 의 1씩 추가되고 
		 *  n - 2 의 추가되고
		 * 	dp[n]  = 해당 2 * n 을 채우는 방법의 수
		 * */
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Integer[] dp = new Integer[n + 1];
		
		dp[0] = 1;
		dp[1] = 1;
		
		
		for(int i = 2 ; i < n + 1; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
		}
 		
		System.out.println(dp[n]);
	
	}
}
