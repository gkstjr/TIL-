package colombus.week2_dfs_bfs_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 주어진 지도에서 모든 지점에서 목표지점까지의 거리를 구하자.
//핵심 개념 : bfs 알고리즘
//예상 시간복잡도 : 
//오답노트 -> 
public class grpah_14940_필수 {
	static int[][] map;
	static int n , m ; // n - row , m - col
	static boolean[][] visited;
	static int[] moveRow = {1 , 0 , -1 , 0};
	static int[] moveCol = {0 , -1 , 0 , 1};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.valueOf(st.nextToken());
		m = Integer.valueOf(st.nextToken());
		
		map = new int[n][m];
		visited = new boolean[n][m];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < m; j++) {
				map[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < n; i++) {
			for(int j = 0 ; j < m ; j++) {
				if(map[i][j] == 2 && !visited[i][j]) {
					bfs(i , j);
				}
			}
		}
		
		for(int i = 0 ; i < n; i++) {
			for(int j = 0 ; j < m ; j++) {
				if(map[i][j] == 1 && !visited[i][j]) {
					map[i][j] = -1;
				}
				sb.append(map[i][j]).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	static void bfs(int row , int col) {
		visited[row][col] = true;
		map[row][col] = 0;
		Queue<int[]> que = new LinkedList<int[]>();
		int[] rowCol = new int[] {row , col};
		que.offer(rowCol);
		
		while(!que.isEmpty()) {
			int[] queRowCol = que.poll();
			int queRow = queRowCol[0];
			int queCol = queRowCol[1];
			for(int i = 0; i < 4; i++) {
				int nextRow = queRow + moveRow[i];
				int nextCol = queCol + moveCol[i];
				if(nextRow >= 0 && nextCol >= 0 && nextRow < n && nextCol <m) {					
					if(!visited[nextRow][nextCol] && map[nextRow][nextCol] == 1) {
						que.offer(new int[] {nextRow,nextCol});
						visited[nextRow][nextCol] = true;
						map[nextRow][nextCol] = map[queRow][queCol] + 1;
					}
				}
			}
		}
	}
}
	