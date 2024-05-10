package colombus.week3_dfs_bfs_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 
//핵심 개념 : dfs / bfs 알고리즘
//예상 시간복잡도 : 
//오답노트 -> 
public class bfs_7562_필수문제4 {
	static int[][] map; // 방문배열은 값이 0이면 방문 안한걸로 대체 , 매 테스트마다 map 초기화
	static int I;
	static int[] start = new int[2]; //0 -  시작 지점 행 , 1 - 시작 지점 열
	static int[] destiny = new int[2]; //0 -  목표 지점 행 , 1 - 목표지점 열
	static int[] moveR = {1 , 1 , 2 , 2 , -1 , -1 , -2 , -2};
	static int[] moveC = {-2, 2 , -1 , 1 ,-2 , 2 , -1 , 1};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int t = 0 ; t < T; t++) {
			I = Integer.valueOf(br.readLine());
			map = new int[I][I];
			st = new StringTokenizer(br.readLine());
			start[0] = Integer.valueOf(st.nextToken());
			start[1] = Integer.valueOf(st.nextToken());
			st = new StringTokenizer(br.readLine());
			destiny[0] = Integer.valueOf(st.nextToken());
			destiny[1] = Integer.valueOf(st.nextToken());
			
			if(start[0] == destiny[0] && start[1] == destiny[1]) {
				sb.append(0).append("\n");
				continue;
			}
			bfs(start[0] , start[1]);
			sb.append(map[destiny[0]][destiny[1]]).append("\n");
			
		}
		 System.out.println(sb);
	}
	
	
	static void bfs(int row , int col) {
		Queue<int[]> que = new LinkedList<int[]>();
		que.offer(new int[] {row , col});
		
		while(!que.isEmpty()) {
			int[] qArr = que.poll();
			int qRow = qArr[0];
			int qCol = qArr[1];
			
			for(int i = 0; i < 8; i++) {
				int nextR = qRow + moveR[i];
				int nextC = qCol + moveC[i];
				
				if(nextR >= 0 && nextC >= 0 && nextR < I && nextC < I) {
					if(map[nextR][nextC] == 0) { //0이면 방문 아직 안한 거임
						map[nextR][nextC] = map[qRow][qCol] + 1;
						que.offer(new int[] {nextR , nextC});
					}
				}
			}
		}
	}
}
	