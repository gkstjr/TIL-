package august1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;
/*
 * 	dp[n]은 n개의 카드를 가질 때 가장 큰 최댓
 * */
class Day18_10828 {
    public static void main(String args[]) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	Stack<Integer> stk = new Stack<Integer>();
    	
    	for(int i = 0 ; i < n; i++) {
    		st = new StringTokenizer(br.readLine());
    		
    		String order = st.nextToken();
    		
    		if(order.equals("push")) {
    			int orderNum = Integer.parseInt(st.nextToken());
    			stk.push(orderNum);
    		}else if(order.equals("pop")) {
    			if(stk.isEmpty()) sb.append("-1").append("\n");
    			else sb.append(stk.pop()).append("\n");
    		}else if(order.equals("size")) {
    			sb.append(stk.size()).append("\n");
    		}else if(order.equals("empty")) {
    			if(stk.isEmpty()) sb.append("1").append("\n");
    			else sb.append("0").append("\n");
    		}else if(order.equals("top")) {
    			if(stk.isEmpty()) sb.append("-1").append("\n");
    			else sb.append(stk.peek()).append("\n");
    		}
    	}
    	
    	System.out.println(sb);
    }
}
