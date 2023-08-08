package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

		/* 
		 * 	dp[n(자릿수)][자릿값]  = 해당 n 의 자릿수의 계단의 경우의 수를 구함
		 *  자릿값이 0 일때는 자릿값이 1만 가능
		 *  자릿값이 9일때는 자릿값이 8만 가능
		 * 	모듈러 방식 나눗셈을 이해해야 한다.
		 * */
public class Day08_10844 {
	static Long[][] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new Long[n + 1][10]; 
		Long result = 0L;
		
		for(int i = 0 ; i < 10; i++) {
			dp[1][i] = 1L;
		}
	
		for(int i = 1 ; i <= 9; i++ ) {
			result += recur(n , i);
		}
		
		System.out.println(result % 1000000000);
	}
	static long recur(int digit , int val) {
		
		if(digit == 1) {
			return dp[1][val];
		}
		
		if(dp[digit][val] == null) {
			if(val == 0) {
				dp[digit][val] = recur(digit - 1,val + 1);
			}else if(val == 9) {
				dp[digit][val] = recur(digit - 1,val - 1);
			}else
				dp[digit][val] = recur(digit - 1,val - 1) + recur(digit - 1,val + 1);
		}
		
		return dp[digit][val] % 1000000000;
	}
}
