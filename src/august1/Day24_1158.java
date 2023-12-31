package august1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
/*
 * */
class Day24_1158 {
    public static void main(String args[]) throws Exception {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	StringBuilder sb = new StringBuilder();
    	
    	int n = Integer.parseInt(st.nextToken());
    	int k = Integer.parseInt(st.nextToken());
    	
    	sb.append("<");
    	Queue<Integer> que = new LinkedList<Integer>();
    	
    	for(int i = 1 ; i < n + 1; i++) {
    		que.offer(i);
    	}
    	
    	int cnt = 0;
    	while(que.size() != 1) {
    		cnt++;
    		if(cnt == k) {
    			sb.append(que.poll() + ", ");
    			cnt = 0;
    		}else {
    			que.offer(que.poll());
    		}
    	}
    	sb.append(que.poll() + ">");
    	System.out.println(sb);
    }
    
    
    
    
}
