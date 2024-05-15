package colombus.week4_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
문제 설명 : 스티커의 최대값 구하는 값
핵심 개념 : dp 알고리즘 점화식) dp[n][0] = dp[n - 2][0] + map[n][0];
 									 dp[n - 2][1] + map[n][0];
						           = dp[n - 1][1] + map[n][0]; 중의 더 큰 값
						 dp[n][1] = dp[n - 2][0] + map[n][1];
 									 dp[n - 2][1] + map[n][1];
						           = dp[n - 1][0] + map[n][1]; 중의 더 큰 값			

예상 시간복잡도 : 
오답노트 -> 
*/

public class dp_9465_필수문제7 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		int[][] map;
		int[][] dp;
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int t = 0; t < T; t++) {
			int N = Integer.valueOf(br.readLine());
			map = new int[N + 1][2];
			dp = new int[N + 1][2];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 1; i < N + 1; i++) {
				map[i][0] = Integer.valueOf(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for(int i = 1; i < N + 1; i++) {
				map[i][1] = Integer.valueOf(st.nextToken());
			}
			
			dp[1][0] = map[1][0];
			dp[1][1] = map[1][1];
			
			for(int i = 2; i < N + 1; i++) {
				dp[i][0] = Math.max(Math.max(dp[i - 2][0], dp[i - 2][1]),dp[i - 1][1]) + map[i][0];
				dp[i][1] = Math.max(Math.max(dp[i - 2][0], dp[i - 2][1]),dp[i - 1][0]) + map[i][1];

			}
			
			sb.append(Math.max(dp[N][0], dp[N][1])).append("\n");
		}
		System.out.println(sb);
	}
	
}
	