package algo.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Dfs7 {
		static int[][] arr;
		static int answer = 0;
		static int[] dx = {1,0,-1,0};
		static int[] dy = {0,1,0,-1};
		static boolean[][] visited;
		static int N;
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		int maxHeight = 0;
		for(int i = 0 ; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] > maxHeight) {
					maxHeight = arr[i][j];
				}
				
			}	
		}
		int height = 1;
		
		for(int l = 0 ; l < maxHeight; l++) {
			
			int count = 0;	
			visited = new boolean[N][N];
			for (int i = 0; i < N; i++) {
			    Arrays.fill(visited[i], false);
			}
			
			for(int i = 0 ; i < N; i++) {
				for(int j = 0; j < N; j++) {
					
					if(arr[i][j] > height && !visited[i][j]) {
						count++;
						Dfs(i,j,height);
					}
				}
			}
			
			
			
			answer = Math.max(count, answer);
			
			height++;
		}
		
		System.out.println((answer == 0) ? 1 : answer);
	}
	
	private static void Dfs(int i , int j , int height) {
		visited[i][j] = true;
		
		for(int k = 0; k < 4; k++) {
			int nextX = i + dx[k];
			int nextY = j + dy[k];
			
			if(nextX<0||nextY<0||nextX>=N||nextY>=N||arr[nextX][nextY]<=height||visited[nextX][nextY])
				continue;
				Dfs(nextX , nextY , height);
			
		}
	}
}
