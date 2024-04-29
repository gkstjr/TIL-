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
	static StringBuilder sb;
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true) {
			sb = new StringBuilder();
			st = new StringTokenizer(br.readLine());
			
			k = Integer.valueOf(st.nextToken());
			S = new int[k];
			if(k == 0) break;
			for(int i = 0; i < k; i++) {
				S[i] = Integer.valueOf(st.nextToken());
			}
			
			dfs(0 , 0);
			
			System.out.println(sb);
		}
	}
	
	public static void dfs(int start , int depth) {
		
	}
}
	