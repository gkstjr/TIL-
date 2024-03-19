package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 	x�� 	1) 3, 2�� �ּҰ���� 6�� �� 
 	    2) 3���� ������ �� ��
 	    3) 2�θ� ������ �� ��
 	    4) �ƹ��͵� ������ ���� ���� ��
 	    
 	    Ư�̻���) 3 �̳� 2�� ������ ���ٰ� �ؼ� 1 ���� �� ���� �ּҰ��� ������ �� �ƴϴ�.
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