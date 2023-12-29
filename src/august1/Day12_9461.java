package august1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Day12_9461 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        long[] dp = new long[101];
        dp[1] = 1; dp[2] = 1; 
        
        for(int i = 3; i < 101; i++) {
        	dp[i] = dp[i - 3] + dp[i - 2];
        }
        
        for(int i = 0; i < t; i++) {
        	int n = Integer.parseInt(br.readLine());
        	
        	System.out.println(dp[n]);
        }
        
        
    }
}
