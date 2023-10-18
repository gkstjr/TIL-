package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/* 	
	
*/
public class Main {	
	static int[] dp;
	static int[] A;
	static int[] lastIndex;
	static StringBuilder sb;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		dp = new int[n + 1];
		A = new int[n + 1];
		lastIndex = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i <= n; i++) {
			dp[i] = 1;
			for(int j = 1; j <= i - 1; j++) {
				if(dp[j] + 1 > dp[i] && A[j] < A[i]) {
					dp[i] = dp[j] + 1;
					lastIndex[i] = j;
				}
			}
		}
		
		//dp의 값중에 가장 긴 수열인 값 찾기 because 현재 dp[i] 는 i에서의 수열의 길이를 보여주기때문
		int answer = 0;
		int answerIndex = 0;
		for(int i = 1; i <= n; i++) {
			if(dp[i] > answer) {
				answer = dp[i];
				answerIndex = i;
			}
		}
		sb = new StringBuilder();
		
		sb.append(answer).append("\n");
		recur(answerIndex);
		
		System.out.println(sb);
 	}
	static void recur(int n) {
		if(n == 0) return;
		recur(lastIndex[n]);
		sb.append(A[n]).append(" ");
		
	}
}
