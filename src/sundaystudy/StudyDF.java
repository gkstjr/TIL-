package sundaystudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class StudyDF { // 첫 DP 문제인데 이론은 쉬워보였는데 문제풀려고 하니 조그만 부분에서부터의 규칙을 찾아내지 못하겠음..
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[] dp = new int[11];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 4 ; i < 11; i++) { // 문제에서 정수가 11보다 작다고 했으니 11보다 작은 정수의 합을 다 구해줌
			
			dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
		}
		
		for(int i = 0 ; i < n; i++ ) {
			int num = Integer.parseInt(br.readLine());
			
			sb.append(dp[num]).append("\n");
		}
		
		System.out.println(sb);
	}
	
}