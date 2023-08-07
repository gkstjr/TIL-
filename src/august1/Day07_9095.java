package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

		/* 
		 * 	dp[n]  = �ش� n �� ������ 1, 2 , 3 ������ ������ ������ ���ϴ� ����� ��
		 *  n - 3 �� ���� + n - 2 �� ���� + n - 1�� ���� 
		 * */
public class Day07_9095 {
	public static void main(String[] args) throws NumberFormatException, IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int test = Integer.parseInt(br.readLine());
		
		Integer[] dp = new Integer[12];
		dp[1] = 1; dp[2] = 2; dp[3] = 4;
		
		
		for(int i = 4; i <= 11; i++) {
			dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
		}
		for(int i = 0 ; i < test; i++) {
			int n = Integer.parseInt(br.readLine());
			
			sb.append(dp[n]).append("\n");
		}
		System.out.println(sb);
		 		
	
	}
}
