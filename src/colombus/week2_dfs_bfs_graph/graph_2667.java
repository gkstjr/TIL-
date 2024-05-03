package colombus.week2_dfs_bfs_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 
//핵심 개념 : dfs / bfs 알고리즘
//예상 시간복잡도 : 
//오답노트 -> 
public class graph_2667 {
	static int cnt;
	static ArrayList<Integer> ans = new ArrayList<Integer>();
	static int[][] home;
	static boolean[][] visited;
	static int[] moveRow = {1, 0 , -1 , 0};
	static int[] moveCol = {0, 1 ,  0 , -1};
	static int N;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		home = new int[N][N];
		visited = new boolean[N][N];
		for(int i = 0; i < N; i++) {
			String[] str = br.readLine().split("");
			for(int j = 0; j < N; j++) {
				home[i][j] = Integer.parseInt(str[j]);
			}
		}
		for(int i = 0 ; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(!visited[i][j] && home[i][j] == 1) {
					cnt = 0;
					dfs(i , j);
					ans.add(cnt);
				}				
			}
		}
		Collections.sort(ans);
		StringBuilder sb = new StringBuilder();
		sb.append(ans.size()).append("\n");
		for(int n : ans) {
			sb.append(n).append("\n");
		}
		System.out.println(sb);
	}
	
	static void dfs(int row , int col) {
		visited[row][col] = true;
		cnt++;
		for(int i = 0 ; i < 4; i++) {
			int nextRow = row + moveRow[i];
			int nextCol = col + moveCol[i];
			
			if(nextRow >= 0 && nextCol >= 0 && nextRow < N  && nextCol < N) {
				if(!visited[nextRow][nextCol] && home[nextRow][nextCol] == 1) {
						dfs(nextRow , nextCol);
				}
			}
		}
	}
}
	