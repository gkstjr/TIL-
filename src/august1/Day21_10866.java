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
class Day21_10866 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        Deque<Integer> deq = new ArrayDeque<Integer>();
        
        for(int i = 0 ; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
        	String order = st.nextToken();
        	int num = 0;
        	switch (order) {
			case "push_front" :
				num = Integer.parseInt(st.nextToken());
				deq.offerFirst(num);
				break;
			case "push_back" :
				num = Integer.parseInt(st.nextToken());
				deq.offerLast(num);
				break;
			case "pop_front" :
				if(deq.isEmpty()) sb.append(-1).append("\n");
				else sb.append(deq.pollFirst()).append("\n");
				break;
			case "pop_back" : 
				if(deq.isEmpty()) sb.append(-1).append("\n");
				else sb.append(deq.pollLast()).append("\n");
				break;
			case "size" :
				sb.append(deq.size()).append("\n");
				break;
			case "empty" : 
				if(deq.isEmpty()) sb.append(1).append("\n");
				else sb.append(0).append("\n");
				break;
			case "front" :
				if(deq.isEmpty()) sb.append(-1).append("\n");
				else sb.append(deq.peekFirst()).append("\n");
				break;
			case "back" :
				if(deq.isEmpty()) sb.append(-1).append("\n");
				else sb.append(deq.peekLast()).append("\n");
				break;
			
			}
        }
        
        System.out.println(sb);
       }
}
