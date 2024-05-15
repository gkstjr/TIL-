package colombus.week4_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 2 x n 크기의 직사각형을 1 x 2 , 2 x 1 타일로 채우는 방법의 수를 구하라.
//핵심 개념 : dp 알고리즘 점화식)  
//예상 시간복잡도 : 
//오답노트 -> 
public class dp_11726_필수문제6 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(br.readLine());
		int[] dp = new int[1001];
		dp[1] = 1;
		dp[0] = 1;
		for(int i = 2; i <= N; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
		}
		
		System.out.println(dp[N]);
	}	
}
	