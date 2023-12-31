package backjun;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
 
public class Main57 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	StringBuilder sb = new StringBuilder();
	ArrayDeque<Integer> deq = new ArrayDeque<Integer>();
	
	int n = Integer.parseInt(br.readLine());
	for(int i = 0 ; i < n; i++) {
		st = new StringTokenizer(br.readLine());
		String order = st.nextToken();
		if(order.equals("push_front")) {
			int num = Integer.parseInt(st.nextToken());
			deq.offerFirst(num);
		}else if(order.equals("push_back")) {
			int num = Integer.parseInt(st.nextToken());
			deq.offer(num);
		}else if(order.equals("pop_front")) {
			if(deq.isEmpty()) {
				sb.append("-1").append("\n");
			}else {
				int num = deq.poll();
				sb.append(num).append("\n");
			}
		}else if(order.equals("pop_back")) {
			if(deq.isEmpty()) {
				sb.append("-1").append("\n");
			}else {
			int num = deq.pollLast();
			sb.append(num).append("\n");
			}
		}else if(order.equals("size")) {
			sb.append(deq.size()).append("\n");
		}else if(order.equals("empty")) {
			if(deq.isEmpty()) {
				sb.append(1).append("\n");
			}else 	sb.append(0).append("\n");
		}else if(order.equals("front")) {
			if(deq.isEmpty()) {
				sb.append("-1").append("\n");
			}else {
				sb.append(deq.peek()).append("\n");
			}
		}else if(order.equals("back")) {
			if(deq.isEmpty()) {
				sb.append("-1").append("\n");
			}else {
				sb.append(deq.peekLast()).append("\n");
			}
		}
	}
	
	System.out.println(sb);
	}
}