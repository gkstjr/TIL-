package colombus.week2_dfs_bfs_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class graph_1260 {
	static int ans[];
	static int N , M , V;
	static ArrayList[] node;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		V = Integer.valueOf(st.nextToken());
		
		node = new ArrayList[N + 1];
		visited = new boolean[N + 1];
		for(int i = 0; i <= N; i++ ) {
			node[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0 ; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			
			node[a].add(b);
			node[b].add(a);
		
		}
		for(int i = 0 ; i <= N; i++) {
			Collections.sort(node[i]);
		}
		
		dfs(V);
		sb.append("\n");
		visited = new boolean[N + 1];
		bfs(V);
		
		System.out.println(sb);
	}
	
	static void bfs(int n)  {
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(n);
		visited[n] = true;
		while(!que.isEmpty()) {
			int queNum = que.poll();
			sb.append(queNum).append(" ");
			ArrayList<Integer> list = node[queNum];
			for(int i = 0; i < list.size(); i++) {
				if(!visited[list.get(i)]) {
					que.offer(list.get(i));
					visited[list.get(i)] = true;
				}
			}
		}
	}
	
	
	static void dfs(int n) {
		visited[n] = true;
		sb.append(n).append(" ");
		ArrayList<Integer> list = node[n];
		
		for(int i = 0; i < list.size(); i++) {
			if(!visited[list.get(i)]) {
				dfs(list.get(i));
			}
		}
	}
}
	