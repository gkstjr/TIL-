package august1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
/*
 * 	dp[n]은 n개의 카드를 가질 때 가장 큰 최댓
 * */
class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        boolean[] arr = new boolean[200000001];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i < n + 1; i++) {
        	int num = Integer.parseInt(st.nextToken());
        	arr[num] = true;
        }
        
        int cnt = 0;
        for(int i = 1 ; i < 200000001; i++ ) {
        	if(arr[i] == true) {
        		cnt++;
        		if(cnt == k) {
        			System.out.println(i);
        			break;
        		}
        	}
        }
       }
}
