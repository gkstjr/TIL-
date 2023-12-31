package august1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
/*
 * 	dp[n]은 n개의 카드를 가질 때 가장 큰 최댓
 * */
class Day17_11652 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        for(int i = 0 ; i < n; i ++) {
        	long num = Long.parseLong(br.readLine());
        	map.put(num, (map.getOrDefault(num , 0) + 1));
        }
        
        long max = Long.MIN_VALUE;
        long answer = 0;
        for(long val : map.keySet()) {
        	if(map.get(val) > max) {
        		max = map.get(val);
        		answer = val;
        	}else if(map.get(val) == max) {
        		answer = Math.min(val, answer);
        	}
        }
        
        System.out.println(answer);
       }
}
