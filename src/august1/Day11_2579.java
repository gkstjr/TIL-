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
		 *  dp[n] = n개의 계단에 오를때의 최댓값 
		 *  점화식 dp[n] = dp[n-3] + str[n - 1] + str[n] 와 dp[n-2] + str[n] 중의 더 큰 값이 dp[n]
		 *  	  
		 * */
public class Day11_2579 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[301];
		int[] str = new int[301];
		
		for(int i = 1; i < n + 1 ; i++) {
			str[i] = Integer.parseInt(br.readLine());
		}
		dp[0] = 0 ; dp[1] = str[1]; dp[2] = str[1] + str[2];
		
		for(int i = 3; i < n + 1; i++ ) {
			dp[i] = Math.max(dp[i - 3] + str[i - 1] + str[i] , dp[i - 2] + str[i]); 
		}
	
		System.out.println(dp[n]);
	}
}
