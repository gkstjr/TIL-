package algo.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Dfs9 {
	
	static int[][] arr;
	static int N , M;
	static boolean[][] visited;
	static int[] dx = {0, 0, 1 , -1};
	static int[] dy = {1, -1, 0 , 0};
	static int count;
	static ArrayList<Integer> answerList = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st= new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i = 0 ; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for(int j = y1; j < y2; j++) {
				for(int k = x1; k < x2; k++) {
					arr[j][k] = 1;
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(arr[i][j] == 0 && !visited[i][j]) {
					count = 1;
					Dfs(i,j);
					answerList.add(count);
				}
			}
		}

		Collections.sort(answerList);
		sb.append(answerList.size()).append("\n");
		
		for(int answer : answerList) {
			sb.append(answer).append(" ");
		}
		System.out.println(sb);
		
	}

	private static void Dfs(int i, int j) {
		visited[i][j] = true;
		
		for(int k = 0; k < 4; k++) {
			int nextY = i + dy[k];
			int nextX = j + dx[k];
			
			if(nextX >= 0 && nextY >= 0 && nextX < M && nextY < N) {
				if(arr[nextY][nextX] == 0 && !visited[nextY][nextX]) {
					count++;
					Dfs(nextY,nextX);
				}
			}
		}
		
	}
}
