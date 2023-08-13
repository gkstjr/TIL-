package august1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * 	dp[n][k] = dp[n
 * */
class Day13_2225 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        long[][] dp = new long[201][201];
        
        for(int i = 0 ; i < n + 1; i++) {
        	dp[i][1] = 1;
        }
        
        for(int i = 0; i < n + 1; i++) {
        	for(int j = 1; j < k + 1; j++) {
        		for(int l = 0; l <= i; l++) {
        			dp[i][j] += dp[l][j - 1] % 1000000000;
        		}
        	}
        }
        
        System.out.println(dp[n][k] % 1000000000);
    }
}
