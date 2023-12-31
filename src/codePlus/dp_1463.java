package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/* dp[2] = 1 dp[3] = 1
 * dp[n] = 1 + dp[n - 1] n이 3이나 2로 안 나누어 떨어질 때
 * dp[n] = 1 + dp[n / 2] n이 2로 나누어 떨어질 때
 * dp[n] = 1 + dp[n / 3]n 이 3으로 나우어 떨어질 
	
*/
public class dp_1463 {
	static Integer[] dp;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new Integer[n + 1];
		
		dp[0] = 0;
		dp[1] = 0;
		
 		System.out.println(reDp(n));
	}
	
	static int reDp(int n) {
		
		if(dp[n] == null) {
			//6으로 나누어떨어지면
			if(n % 6 == 0) {
				dp[n] = Math.min(reDp(n - 1), Math.min(reDp(n / 3), reDp(n / 2))) + 1;
			}else if(n % 3 == 0) { // 3으로 나누어 떨어지면
				dp[n] = Math.min(reDp(n / 3), reDp(n -1)) + 1;
			}else if(n % 2 == 0) { // 2으로 나누어 떨어지면
				dp[n] = Math.min(reDp(n / 2), reDp(n - 1)) + 1;
			}else {
				dp[n] = reDp(n - 1) + 1;
			}
		} 
		return dp[n];
	}
}
