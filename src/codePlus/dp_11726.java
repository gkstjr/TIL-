package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/* 
	dp[n] = 2 * n 크기의 직사각형을 채우는 방법의 수
	점화식 -> dp[n] = dp[n - 1] + dp[n - 2];
*/
public class dp_11726 {
	static Integer[] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new Integer[n + 1];
		dp[1] = 1;
		dp[0] = 1;
		
		System.out.println(recur(n));
		
	}
	
	static int recur(int n) {
		if(dp[n] == null) { // dp값이 아직 구해지지 않았을 때(메모이제이션되지 않았을 
			dp[n] = (recur(n - 1) + recur(n - 2)) % 10007;
		}
		return dp[n];
	}
}
