package colombus.week4_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
문제 설명 : 연산 최소 횟수 구하기
핵심 개념 : dp -> 점화식 (3가지 경우중 최소값으로 변수 할당 = 1. dp[n] = dp[n / 3] + 1; n이 3으로 나누어 질 때
													2. dp[n] = dp[n / 2] + 1; n이 2으로 나누어 질 때
													3. dp[n] = dp[n - 1] + 1; 모든경우
예상 시간복잡도 : 
오답노트 -> 
*/
public class dp_1463_필수문제5 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		
		int[] dp = new int[1000001];
		
		dp[1] = 0;
		
		for(int i = 2; i <= N; i++) {
			int ans = Integer.MAX_VALUE;
//			System.out.print(i + " : ");
			if(i % 3 == 0) {
				ans = Math.min(dp[i / 3] + 1 , ans);
//				System.out.print(" , " + ans);

			}
			if(i % 2 == 0) {
				ans = Math.min(dp[i / 2] + 1 , ans);
//				System.out.print(" , " + ans);

			}

			ans = Math.min(dp[i - 1] + 1, ans);
//			System.out.println(" , " + ans);

			
			dp[i] = ans;
		}
		
		System.out.println(dp[N]);
	}
}
	