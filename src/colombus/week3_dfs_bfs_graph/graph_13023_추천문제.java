package colombus.week3_dfs_bfs_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 
//핵심 개념 : dfs / bfs 알고리즘
//예상 시간복잡도 : 
//오답노트 -> 
public class graph_13023_추천문제 {
	static ArrayList[] friend;
	static int N  , M;
	static int ans = 0;
	static boolean[] visited;
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		
		friend = new ArrayList[N];
		visited = new boolean[N];
		for(int i = 0 ; i < N; i++) {
			friend[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0 ; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			
			friend[a].add(b);
			friend[b].add(a);
		}
		
		for(int i = 0 ; i < N; i++) {
			if(ans == 1) break;	
			dfs(i , 1);
		}
		
		System.out.println(ans);
	}
	
	static void dfs(int n , int depth) {
		if(depth == N) {
			ans = 1;
			return;
		}
		visited[n] = true;
		ArrayList<Integer> neigh = friend[n];
		for(int i = 0 ; i < neigh.size(); i++) {
			if(!visited[neigh.get(i)]) {
				dfs(neigh.get(i) , depth + 1);
			}
		}
		
		visited[n] = false;
	}
}
	