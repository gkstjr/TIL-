package august1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.prefs.BackingStoreException;
/*
 * 	dp[n]은 n개의 카드를 가질 때 가장 큰 최댓
 * */
class Day21_10808 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        
        int[] arr = new int[125];
        
        String str = br.readLine();
        
        for(int i = 0 ; i < str.length(); i++) {
        	arr[str.charAt(i) - 0]++;;
        }
        
        
        for(int i = 97 ; i < 123; i++) {
        	sb.append(arr[i]).append(" ");
        }
        
        System.out.println(sb);
        System.out.println('A' - 0);
    }
    
    
}
