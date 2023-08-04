package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 	x를 	1) 3, 2의 최소공배수 6알 때 
 	    2) 3으로 나누어 질 때
 	    3) 2로만 나누어 질 때
 	    4) 아무것도 나누어 지지 않을 때
 	    
 	    특이사항) 3 이나 2로 나누어 진다고 해서 1 뺴는 것 보다 최소값이 나오는 건 아니다.
 * */

public class Day04_1463 {
		static Integer[] dp;
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new Integer[n + 1];
		dp[0] = dp[1] = 0;
		
		System.out.println(recur(n));
		
	}
	static int recur(int n) {
		
		if(dp[n] == null) {
			if(n % 6 == 0) {
				dp[n] = Math.min(recur(n - 1), Math.min(recur(n / 3), recur(n / 2))) + 1;
			}else if(n % 3 == 0) {
				dp[n] = Math.min(recur(n / 3), recur(n - 1)) + 1;
			}else if(n % 2 == 0) {
				dp[n] = Math.min(recur(n / 2), recur(n - 1)) + 1;
			}else {
				dp[n] = recur(n - 1) + 1;
			}
		}
		
		return dp[n];
		
	}
}
