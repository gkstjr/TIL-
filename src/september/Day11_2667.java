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


public class Day11_2667 {
	
	static int[][] arr;
	static boolean[][] visited;
	static int answer;
	static int arrX[] = {1, 0 , -1 , 0};
	static int arrY[] = {0 , 1, 0 , -1};
	static int N;
	static ArrayList<Integer> total = new ArrayList<Integer>();
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		visited = new boolean[N][N];
		
		for(int i = 0 ; i < N; i++) {
			String str = br.readLine();
			for(int j = 0 ; j < str.length(); j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0 ; j < N; j++) {
				if(!visited[i][j] && arr[i][j] == 1) {
					dfs(i , j);
					total.add(answer);
					answer = 0;
				}
			}
		}
		Collections.sort(total);
		
		sb.append(total.size()).append("\n");
		for(int num : total) {
			sb.append(num).append("\n");
		}
		System.out.println(sb);
	}
	static void dfs(int i , int j) {
		visited[i][j] = true;
		answer++;
		for(int k = 0 ; k < 4; k++) {
			int nextX = i + arrX[k];
			int nextY = j + arrY[k]; 
			if(nextX >= 0 && nextY >= 0 && nextX < N && nextY < N && arr[nextX][nextY] == 1 && !visited[nextX][nextY] ) {
				dfs(nextX , nextY);
			}
		}
	}
}
