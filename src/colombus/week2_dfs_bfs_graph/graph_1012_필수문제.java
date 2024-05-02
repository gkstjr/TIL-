package colombus.week2_dfs_bfs_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 배추 농장에서 인접해있는 배추끼리의 집단 수를 구하는 문제
//핵심 개념 : dfs / bfs 알고리즘
//예상 시간복잡도 : 
//오답노트 -> 
public class graph_1012_필수문제 {
	static int[][] arr;	 		// 배추밭 배열
	static boolean[][] visited; //방문 여부
	static int answer;			//배추 집단의 개수 (정답)
	static int[] x = {0 , 1 , 0 , -1 }; //좌우 배열
	static int[] y = {1 , 0 , -1 , 0 }; //상하 배열
	static int N;
	static int M;
 	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.valueOf(br.readLine()); 		//테스트케이스 수
		StringBuilder sb  = new StringBuilder();
		
		for(int t = 0; t < T; t++) {					//테스트 케이스 반복
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.valueOf(st.nextToken()); 	// 배추밭 가로길이
			N = Integer.parseInt(st.nextToken()); 	// 배추밭 세로길이
			int K = Integer.valueOf(st.nextToken()); 	// 심어져 있는 배추 위치의 개수
			
			arr = new int[N][M]; 
			visited = new boolean[N][M];
			for(int i = 0 ; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.valueOf(st.nextToken());  // 배추 가로위치
				int b = Integer.valueOf(st.nextToken());	 // 배추 세로위치
				
				arr[b][a] = 1;
				
			}
			answer = 0; 	 //정답 초기화 
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					if(!visited[i][j] && arr[i][j] == 1) { //아직 방문을 안했고 배열의 값이 1인경우 dfs 호출
						dfs(i , j);
						answer++; // dfs호출하고 나올 때마다 배추 집단 +1
						
					}
				}
			}
			sb.append(answer).append("\n");
		}
		
		System.out.println(sb);
	}
 	
 	public static void dfs(int i , int j) {
 		visited[i][j] = true;
 		
 		for(int k = 0 ; k < 4; k++) { //상하좌우 구하기
 			int nextX = j + x[k];
 			int nextY = i + y[k];
 			
 			if(nextY < N && nextX < M && nextX >= 0 && nextY >= 0 && !visited[nextY][nextX] && arr[nextY][nextX] == 1) { //가로를 열 배열에  세로를 행 배열에 입력
 				dfs(nextY, nextX);
 			}
 		}
 	}
}
	