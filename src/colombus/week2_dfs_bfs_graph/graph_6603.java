package colombus.week2_dfs_bfs_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 
//핵심 개념 :
//예상 시간복잡도 : 
//오답노트 -> 
public class graph_6603 {
	static int k;
	static int[] S;
	static int[] ans;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			k = Integer.valueOf(st.nextToken());
			S = new int[k];
			ans = new int[6];
			visited = new boolean[k];
			
			if(k == 0) break;
			for(int i = 0; i < k; i++) {
				S[i] = Integer.valueOf(st.nextToken());
			}
			
			dfs(0 , 0);
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	public static void dfs(int start , int depth) {
		if(depth == 6) {
			for(int i = 0 ; i < ans.length; i++) {
				sb.append(ans[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = start; i < S.length; i++) {
			if(!visited[i]) {
				visited[i] = true;
				ans[depth] = S[i];
				dfs(i, depth + 1);
				visited[i] = false;
			}
		}
		
		
	}
}
	