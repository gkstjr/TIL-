package colombus.week4_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 파보나치 수 2
//핵심 개념 : dp 알고리즘 / 수학 조합의 성질 n+1Cr+1 =  nCr + nCr+1 (n == r 이면 1 또는 r == 0 이면 1)
//예상 시간복잡도 : 
//오답노트 -> 
public class dp_1010_추천문제1 {
	static int[][] dp;
	static int N , M;
	static int ans;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			
			N = Integer.valueOf(st.nextToken());
			M = Integer.valueOf(st.nextToken());
			
			dp = new int[M + 1][N + 1];
			
			ans = recur(M ,N);
			sb.append(ans).append("\n");
		}
		
		System.out.println(sb);
	}
	
	
	public static int recur(int n , int m) {
		if(dp[n][m] > 0) return dp[n][m];
		
		if(n == m || m == 0) {
			return dp[n][m] = 1;
		}
	
		return dp[n][m] = recur(n - 1 , m - 1) + recur(n - 1 , m);
	}
}	