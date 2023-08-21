package august1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
/*
 * */
class Day21_10845 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        LinkedList<Integer> que = new LinkedList<Integer>();
        
        for(int i = 0 ; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
        	
        	String order = st.nextToken();
        	
        	if(order.equals("push")) {
        		int num = Integer.parseInt(st.nextToken());
        		que.offer(num);
        	}else if(order.equals("pop")) {
        		if(que.isEmpty()) sb.append(-1).append("\n");
        		else sb.append(que.poll()).append("\n");
        	}else if(order.equals("size")) {
        		sb.append(que.size()).append("\n");
        	}else if(order.equals("empty")) {
        		if(que.isEmpty()) sb.append(1).append("\n");
        		else sb.append(0).append("\n");
        	}else if(order.equals("front")) {
        		if(que.isEmpty()) sb.append(-1).append("\n");
        		else sb.append(que.peek()).append("\n");
        	}else if(order.equals("back")) {
        		if(que.isEmpty()) sb.append(-1).append("\n");
        		else sb.append(que.get(que.size() - 1)).append("\n");
        	}
        }
        
        System.out.println(sb);
    }
       
}
