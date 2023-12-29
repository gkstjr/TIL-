package algo.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Bfs4 { 	//너비 우선 탐색 복기 완료 
		
	static int m , n;
	static int[][] arr;
	static boolean[][] visited;
	static int count;
	static int[] horizon = {0 , 1 , 0 , -1};
	static int[] vertical = {1 , 0 , -1 , 0};
	
	public static void main(String[] args) throws NumberFormatException, IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T != 0) { // 테스트 케이스맏 ㅏ반복
		st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m];
			count = 0;
			T--;
			
			for(int i = 0 ; i < k; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				arr[y][x] = 1;
			}
			
			
			for(int i = 0 ; i < n; i++) {
				for(int j = 0 ; j < m; j++) {
					if(!visited[i][j] && arr[i][j] == 1) {
						count++;
						visited[i][j] = true;
						Bfs(i,j);
					}
				}
			}
			
			sb.append(count).append("\n");
		}
		System.out.println(sb);
		
	}

	private static void Bfs(int i , int j) {
		
		for(int k = 0; k < 4; k++) {
			int nextX = i + horizon[k];
			int nextY = j + vertical[k];
			
			if(nextX >= 0 && nextY >=0 && nextX < n && nextY < m) {			
				if(!visited[nextX][nextY] && arr[nextX][nextY] == 1) {
					visited[nextX][nextY] = true;
					Bfs(nextX,nextY);
				}
			}
		}
	}
    
}