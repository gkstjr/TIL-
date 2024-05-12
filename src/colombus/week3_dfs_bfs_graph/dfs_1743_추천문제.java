package colombus.week3_dfs_bfs_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 
//핵심 개념 : dfs / bfs 알고리즘
//예상 시간복잡도 : 
//오답노트 -> 
public class dfs_1743_추천문제 {
	static int N , M , K;
	static int[][] map;
	static boolean[][] visited;
	static int maxAns = Integer.MIN_VALUE;
	static int ans;
	static int[] moveR = {1 , 0 , -1 , 0};
	static int[] moveC = {0 , -1,  0 , 1};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		K = Integer.valueOf(st.nextToken());
		
		map = new int[N + 1][M + 1];
		visited = new boolean[N + 1][M + 1];
		
		for(int i = 0 ; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			
			map[a][b] = 1;
		}
		
		for(int i = 1; i < N + 1; i++) {
			for(int j = 1 ; j < M + 1; j++) {
				if(!visited[i][j] && map[i][j] == 1) {
					ans = 0;
					dfs(i , j);
					maxAns = Math.max(maxAns, ans);
				}
			}
		}
		
		System.out.println(maxAns);
	}
	
	static void dfs(int r , int c) {
		visited[r][c] = true;
		ans++;
		
		for(int i = 0 ; i < 4; i++) {
			int nextR = r + moveR[i];
			int nextC = c + moveC[i];
		
			if(nextR >= 0 && nextC >= 0 && nextR < N + 1 && nextC < M + 1) {
				if(!visited[nextR][nextC] && map[nextR][nextC] == 1) {
					dfs(nextR , nextC);
				}
			}
		}
	}
}
	