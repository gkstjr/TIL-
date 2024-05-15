package colombus.week4_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명  : 설탕 배달 3kg , 5kg 봉투로 배달할 수 있는 최소 봉투 수 구하기
//핵심 개념 : dp 알고리즘 -> 점화식 1. dp[n] = dp[n - 3] + 1 (n 이 5의 배수가 아닐때 and dp[n - 3] 이 - 1이면 dp[n] 도 -1)
//							  2. dp[n] = dp[n - 5] + 1 (n이 5 의 배수 일때						
//예상 시간복잡도 : 
//오답노트 -> 
public class dp_2839_필수문제4 {
	public static void main(String[] args) throws Exception {
		int[] dp = new int[5001];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(br.readLine());
		
		for(int i = 3; i <= N; i++) {
			if(i % 5 == 0) { //5의 배수일 때
				dp[i] = dp[i - 5] + 1;
			}else { //5의 배수가 아닐 때
				if(dp[i - 3] == -1 || i == 4) {
					dp[i] = -1;
				}else {
					dp[i] = dp[i - 3] + 1;
				}
			}
		}
		
		System.out.println(dp[N]);
	}
}	