package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

		/* 
		 * 	dp[n(�ڸ���)][�ڸ���]  = �ش� n �� �ڸ����� �ڸ����� ���������� ������ ����� ���� ����
		 *  recur �Լ��ȿ��� �ݺ��� �ʿ�������?
		 *  
		 * 	��ⷯ ��� �������� �����ؾ� �Ѵ�.
		 * */
public class Day08_11057 {
	static Integer[][] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		dp = new Integer[1001][10];
		for(int i = 0 ; i < 10; i++) {
			dp[1][i] = 1;
		}
		
		int result = 0;
		for(int i = 0 ; i < 10; i++) {
			result += recur(n , i);
		}
		
		System.out.println(result % 10007);
	}

	static int recur(int digit,int val) {
		
		if(digit == 1) {
			return dp[1][val];
		}
		
		if(dp[digit][val] == null) {
			dp[digit][val] = 0;
			for(int i = val; i <=9; i++ ) {
				dp[digit][val] += recur(digit - 1,i);
			}
			
		}
		
		return dp[digit][val] % 10007;
	}
}
