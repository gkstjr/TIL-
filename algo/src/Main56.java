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
 
public class Main56 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> que = new LinkedList<Integer>();
		Queue<Integer> answer = new LinkedList<Integer>();
		
		for(int i = 1; i <= n; i++) {
			que.offer(i);
		}
		
		int cnt = 1;
		while(!que.isEmpty()) {
			
			if(cnt == k) {
				int num = que.poll();
				answer.offer(num);
				cnt = 1;
			}else {
				int num = que.poll();
				que.offer(num);
				cnt++;
			}
		
		}
		
		sb.append("<").append(answer.poll());

		while(!answer.isEmpty()) {
			sb.append(", ").append(answer.poll());
		}
		
		sb.append(">");
		
		System.out.println(sb);
	}
}