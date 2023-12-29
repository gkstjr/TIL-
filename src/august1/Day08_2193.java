package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

		/* 
		 * 	dp[n(자릿수)][자릿값]  = 해당 n 의 자릿수의 자릿값의 오름차순만 가능한 경우의 수를 구함
		 *  recur 함수안에서 반복문 필요할지도?
		 *  
		 * 	모듈러 방식 나눗셈을 이해해야 한다.
		 * */
public class Day08_2193 {
	static Long[][] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		dp = new Long[91][2];
		dp[1][1] = 1L;
		dp[1][0] = 1L;
				
		System.out.println(recur(n,1));
	}

	static Long recur(int digit,int val) {
		
		if(digit == 1L) {
			return dp[1][val];
		}
		
		if(dp[digit][val] == null) {
			
			if(val == 0) {
				dp[digit][val] = recur(digit - 1, 1) + recur(digit - 1, 0);
			}else if(val == 1) {
				dp[digit][val] = recur(digit - 1,0);
			}
		}
		
		return dp[digit][val];
	}
}
