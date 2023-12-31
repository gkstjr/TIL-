package algo.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dfs6 {
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {0 , 1 , 0 , -1 , 1 , -1 , 1 , -1}; 
	static int[] dy = {1 , 0 , -1 , 0 , 1 , -1 , -1 , 1};
	static int w;
	static int h;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			w = Integer.parseInt(st.nextToken()); 
			h = Integer.parseInt(st.nextToken());
			
			if(w == 0 && h ==0) {
				break;
			}
			arr = new int[h][w];
			visited = new boolean[h][w];
			int count = 0;
			
			for(int i = 0 ; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0 ; j < w; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					visited[i][j] = false;
				}				
			}
			
			for(int i = 0 ; i < h; i++) {
				for(int j = 0 ; j < w; j++) {
					if(arr[i][j] == 1 && !visited[i][j]) {
						visited[i][j] = true;
						count++;
						Dfs(i,j);
					}
				}
			}
			System.out.println(count);
		}
	
	}
	public static void Dfs(int i , int j) {
			for(int k = 0 ; k < 8; k++) {
				int nextX = j + dx[k];
				int nextY = i + dy[k];
				
				if(nextX >= 0 && nextY >=0 && nextX < w && nextY < h) {
					if(arr[nextY][nextX] == 1 && !visited[nextY][nextX]) {
						visited[nextY][nextX] = true;
						Dfs(nextY,nextX);
					}
				}
			}
	}
	
}
