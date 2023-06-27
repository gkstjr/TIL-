package bfs; 
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
//DFs 정리 정보처리기사공부 준비 이유로 한달동안은 풀었던 문제 복기 정도만 하기
class Dfs5 {
		static int n;
		static int[][] arr;
		static boolean[][] visited;
		static int count;
		static ArrayList<Integer> list = new ArrayList<Integer>();
		static int[] dx = {1,0,-1,0};
		static int[] dy = {0,1,0,-1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		visited = new boolean[n][n];
		for(int i = 0 ; i < n; i++) {
			String str = br.readLine();
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0 ; j < n; j++) {
				if(!visited[i][j] && arr[i][j] == 1 ) {
					count = 1;
 				   list.add(Dfs(i,j));
				}
			}
		}
		Collections.sort(list);
		sb.append(list.size()).append("\n");
		for(int answer : list) {
			sb.append(answer).append("\n");
		}
		System.out.println(sb);
	}

	private static int Dfs(int i, int j) {
		
		for(int k = 0; k < 4; k++) {
			visited[i][j] = true;
			int nextX = i + dx[k];
			int nextY = j + dy[k];
			
			if(nextX >=0 && nextY >=0 && nextX < n && nextY < n) {
				if(!visited[nextX][nextY] && arr[nextX][nextY] == 1) {
					count++;
//					visited[nextX][nextY] = true;
					Dfs(nextX,nextY);
				}
			}
		}
		return count; 
	}
}
