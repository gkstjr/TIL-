package codePlus;

import java.util.*;
import java.io.*;


public class graph_1260 { 
	
	static ArrayList<Integer>[] list;
	static boolean[] check;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[N + 1];
		check = new boolean[N + 1];
		
		for(int i = 1; i < N + 1; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0 ; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list[a].add(b);
			list[b].add(a);
			
		}
		for(int i = 1 ; i < N + 1; i++) {
			Collections.sort(list[i]);
		}
		
		dfs(V);
		sb.append("\n");
		Arrays.fill(check, false);
		bfs(V);
		System.out.println(sb);
		
	}
	
	static void dfs(int v) {
		check[v] = true;
		sb.append(v).append(" ");
		
		for(int i : list[v]) {
			if(!check[i]) {
				dfs(i);
			}
		}
		return;
	}
	
	static void bfs(int v) {
		check[v] = true;
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(v);
		sb.append(v).append(" ");
		while(!que.isEmpty()) {
			for(int i  : list[que.poll()]) {
				if(!check[i]) {
					que.offer(i);
					sb.append(i).append(" ");
					check[i] = true;
				}
			}
		}
		return;
	}
	
}
