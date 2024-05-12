package colombus.week4_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 파보나치 수 2
//핵심 개념 : dp 알고리즘 -> 점화식 dp[n] = dp[n-1] + dp[n-2] (dp[1] = 1)
//예상 시간복잡도 : 
//오답노트 -> 
public class dp_2748_필수문제1 {
	static long[] dp;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(br.readLine());
		
		dp = new long[N + 1];
		dp[1] = 1;
		for(int i = 2 ; i < N + 1; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		
		System.out.println(dp[N]);
	}
}	