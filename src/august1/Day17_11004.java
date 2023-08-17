package august1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
/*
 * 	dp[n]은 n개의 카드를 가질 때 가장 큰 최댓
 * */
class Day17_11004 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        Integer[] arr = new Integer[n];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n; i++) {
        	int num = Integer.parseInt(st.nextToken());
        	arr[i] = num;
        }

        Arrays.sort(arr);
        
        System.out.println(arr[k - 1]);
       }
}
