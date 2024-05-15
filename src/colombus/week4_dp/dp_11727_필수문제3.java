package colombus.week4_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 2 x n 직사각형을 1 x 2 , 2 x 1 , 2 x 2 타일로 채우는 경우의 수 구하는 문제
//핵심 개념 : dp 알고리즘 -> 4번까지 그려봤을 때 나오는 패턴으로 점화식 설정 dp[n] = dp[n - 1] + 2dp[n - 2];
//예상 시간복잡도 : 
//오답노트 -> 
public class dp_11727_필수문제3 {
	static long[] dp = new long[1001]; 
	public static void main(String[] args) throws Exception {
		dp[0] = 1; 
		dp[1] = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(br.readLine());
		
		for(int i = 2 ; i <= N; i++) {
			dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;
		}
		
		System.out.println(dp[N]);
	}
}	