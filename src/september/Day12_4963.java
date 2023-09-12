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

import javax.xml.soap.Node;


public class Day12_4963 {
		static int[][] arr;
		static boolean[][] visited;
		static int[] arrX = {1 , 0 ,-1 , 0 , 1 , -1 , 1 ,-1};
		static int[] arrY = {0 , 1 , 0 ,-1 , 1 , -1 ,-1 , 1};
		static int w, h;
		static int answer = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(true) {
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			if(w == 0 && h == 0) break;
			
			arr = new int[h][w];
			visited = new boolean[h][w];
			
			for(int i = 0 ; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				
				for(int j = 0 ; j < w; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i = 0; i < h; i++) {
				for(int j =0 ; j < w; j++) {
					if(!visited[i][j] && arr[i][j] == 1) {
						dfs(i , j);
						answer++;
					}
				}
			}
			sb.append(answer).append("\n");
		answer = 0;
		}
		System.out.println(sb);
		
	}
	static void dfs(int i , int j) {
		visited[i][j] = true;
		
		for(int k = 0; k < 8; k++) {
			int nextX = j + arrX[k];
			int nextY = i + arrY[k];
			
			if(nextX >= 0 && nextY>=0 && nextX < w && nextY < h) {
				if(!visited[nextY][nextX] && arr[nextY][nextX] == 1 ) {
					dfs(nextY , nextX);
				}
			}
		}
	}
}
