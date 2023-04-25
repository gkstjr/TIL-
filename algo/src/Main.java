import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
 
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		Queue<Integer> que = new LinkedList<Integer>();
		int last = 0;
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			if(order.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				que.offer(num);
				last = num;
			}else if(order.equals("pop")) {
				if(que.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					int num = que.poll();
					sb.append(num).append("\n");
				}
			}else if(order.equals("size")) {
				sb.append(que.size()).append("\n");
			}else if(order.equals("empty")) {
				if(que.isEmpty()) {
					sb.append("1").append("\n");
				}else {
					sb.append("0").append("\n");
				}
			}else if(order.equals("front")) {
				if(que.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					sb.append(que.peek()).append("\n");
				}			
			}else if(order.equals("back")) {
				if(que.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					sb.append(last).append("\n");
				}	
			}
	}
		System.out.println(sb);
}
}