package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

		/* 
		 *  n - 1 �� 1�� �߰��ǰ� 
		 *  n - 2 �� �߰��ǰ�
		 *  n�� ������ - 1  �� ��ŭ �߰�
		 * 	dp[n]  = �ش� 2 * n �� ä��� ����� ��
		 * */
public class Day07_11726 {
	public static void main(String[] args) throws NumberFormatException, IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Integer[] dp = new Integer[1001];
		
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 3;
		
		for(int i = 3 ; i < n + 1; i++) {
			dp[i] = (dp[i - 1] + (dp[i - 2] * 2)) % 10007;
		}
 		
		System.out.println(dp[n]);
	
	}
}
