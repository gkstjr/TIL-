package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;


public class Day18_2178 {
	static int N, M;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {1 , -1, 0 , 0};
	static int[] dy = {0 , 0 ,1, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		visited = new boolean[N][M];
		String str = "";
		for(int i = 0 ; i < N; i++) {
			str = br.readLine();
			for(int j = 0 ; j < M; j++) {
				map[i][j] = (str.charAt(j) - '0');
			}
		}
		
		bfs(0,0);
		
		System.out.println(map[N - 1][M - 1]);
		
	
	}
	
	static void bfs(int i , int j) {
		Queue<int[]> que = new LinkedList<int[]>();
		que.add(new int[] {i , j});
		visited[i][j] = true;
		
		while(!que.isEmpty()) {
			int[] arr = que.poll();
			for(int k = 0 ; k < 4; k++) {
				int nextX = arr[1] + dx[k];
				int nextY = arr[0] + dy[k];
			
				if(nextX >= 0 && nextY >= 0 && nextX < M && nextY < N) {
					if(!visited[nextY][nextX] && map[nextY][nextX] != 0) {
						visited[nextY][nextX] = true;
						que.add(new int[] {nextY , nextX});
						map[nextY][nextX] = map[arr[0]][arr[1]] + 1;
					}
				}	
			}	
		}
		
			
	}
}


