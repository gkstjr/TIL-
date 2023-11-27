package codePlus;

import java.util.*;
import java.io.*;
import java.nio.Buffer;


public class Main { 
	static ArrayList<Integer>[] list;
	static int[] check; 
	static int V;
	static int E;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 0 ; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			V = Integer.parseInt(st.nextToken());
			E = Integer.parseInt(st.nextToken());
			
			list = new ArrayList[V + 1];
			check = new int[V + 1];
			
			for(int i = 1; i <= V; i++) {
				list[i] = new ArrayList<Integer>();
			}
			for(int i = 0; i < E; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				list[a].add(b);
				list[b].add(a);
			}
			for(int i =1; i <= V; i++) {
				if(check[i] == 0) dfs(i , 1);
			}
			
			// 정점과 간선의 그룹 값이 같은 지 다른 지 찾기
			boolean ok = true;
			Loop1 : 
			for(int i = 1; i <= V; i++ ) {
				for(int j = 0; j < list[i].size(); j++) {
					int num = list[i].get(j);
					if(check[i] == check[num]) {
						ok = false;
						break Loop1;
					}
				}
			}
			if(ok) sb.append("YES");
			else sb.append("NO");
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	static void dfs(int node ,int c) {
		check[node] = c;
		
		
		for(int i : list[node]) {
			if(check[i] == 0) {
				dfs(i , 3 - c);
			}
		}
	}
	
}
