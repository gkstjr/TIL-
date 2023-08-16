package august1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * 	dp[n]은 n개의 카드를 가질 때 가장 큰 최댓
 * */
class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dp = new int[n + 1];
        int[] seq = new int[n + 1];
        
        for(int i = 1; i < n + 1; i++) {
        	seq[i] = Integer.parseInt(st.nextToken());
        }
        
        dp[1] = seq[1];
        
        for(int i = 2; i < n + 1; i ++) {
        	for(int j = i; j >= 1; j--) {
        		dp[i] = Math.max(dp[i], seq[j] + dp[i - j]);
        	}
        }
        
        System.out.println(dp[n]);
       }
}
