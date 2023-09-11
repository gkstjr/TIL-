package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.xml.soap.Node;


public class Day11_9466 {
	static int answer;
	static int[] select;
	static boolean[] isDone;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			answer = 0;
			int N = Integer.parseInt(br.readLine());
			select = new int[N + 1];
			isDone = new boolean[N + 1];
			visited = new boolean[N + 1];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i = 1 ; i <= N; i++) {
				int next = Integer.parseInt(st.nextToken());
				select[i] = next;
			}
			
			for(int i = 1; i <= N; i++) {
				if(!isDone[i]) dfs(i);
			}
			sb.append(N-answer).append("\n");
			
		}
		System.out.print(sb);

	}
	static void dfs(int n) {
		visited[n] = true;
		int next = select[n];
		
		if(!visited[next]) dfs(next);
		else {
			if(!isDone[next]) {
				answer++;
				isDone[next] = true;
				while(next != n) {
					answer++;
					next = select[next];
					isDone[next] = true;
					
				}
			}
		}
		
		isDone[n] = true;
	}
}