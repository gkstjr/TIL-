package colombus.week2_dfs_bfs_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 	미로에서 1은 이동할 수 있는 칸을 나타내며 이러한 미로에서 (1,1)출발하여 (N,M)의 위치로 이동할 때 지나야 하는 최소의 칸 수를 구하자
//핵심 개념 : 최소경로는 bfs로 풀자
//예상 시간복잡도 : 
//오답노트 -> 정답을 저장하는 부분을 애를 먹었다. 처음에 ans배열을 따로 해서 풀어보려 했지만 원하는 값이 나오지 않았고 힌트를 받아 bfs함수에서 해당 배열로 넘어갈때마다 이전 미로의 값에 +1을 해줌으로써 몇번째 순서인 지 알 수 있었따.

public class bfs_2178_필수문제 {
	static int[][] miro;
	static int N , M;
	static boolean[][] visited;
	static int[] x = {0 , 1 , 0 , -1 }; //좌우 배열
	static int[] y = {1 , 0 , -1 , 0 }; //상하 배열
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		
		miro = new int[N][M]; // 배열 생성
		visited = new boolean[N][M];
		for(int i = 0 ; i < N; i++) { // 배열에 입력 값 설정
			String[] s = br.readLine().split("");     // 한글짜씩 문자열 분리
			for(int j = 0 ; j < M; j++) {
				miro[i][j] = Integer.valueOf(s[j]); 
			}
		}
		bfs(0, 0);
		System.out.println(miro[N - 1][M - 1]);
	}
	
	public static void bfs(int row , int col) {
		Queue<int[]> que = new LinkedList<int[]>();
		int[] rowCol = {row , col}; //[0]이 row값 , [1] 이 col값
 		que.offer(rowCol);
 		visited[row][col] = true;
 		while(!que.isEmpty()) {
 			int[] nums = que.poll();
 			int queRow = nums[0]; int queCol = nums[1];
 			for(int i =0; i < 4; i++) {
 				int nextRow = queRow + y[i];
 				int nextCol = queCol + x[i];
 				if(nextRow >= 0 && nextCol >= 0 && nextRow < N && nextCol < M) {
 					if(!visited[nextRow][nextCol] && miro[nextRow][nextCol] == 1) {
 						int[] nextRowCol = {nextRow , nextCol};
 						visited[nextRow][nextCol] = true;
 						que.offer(nextRowCol);
 						miro[nextRow][nextCol] = miro[queRow][queCol] + 1;
 					}
 				}
 			}
 			
 		}
 		
	}
}
	