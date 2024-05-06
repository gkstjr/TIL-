package colombus.week3_dfs_bfs_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 상하좌우위아래에 인접하면 익는 토마토를 다 익는 지 풀어보는 문제. (행렬의 높이도 있다)
//핵심 개념 : dfs / bfs 알고리즘 / 3차원 배열
//예상 시간복잡도 : 
//오답노트 -> 
public class graph_7569_필수문제1 {
	public static int M, N , H; // 열 , 행 , 높이
	public static int[][][] tomato;
	public static int[] moveH = {0 , 0 , 0 ,0 , 1 , -1};  //Height
	public static int[] moveR = {1 , 0 , -1 , 0 , 0 , 0}; //Row
	public static int[] moveC = {0 , -1 , 0 , 1 , 0 , 0}; //Col
	public static Queue<int[]> que = new LinkedList<int[]>(); 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.valueOf(st.nextToken()); // 열
		N = Integer.valueOf(st.nextToken()); // 행
		H = Integer.valueOf(st.nextToken()); // 높이
		tomato = new int[H][N][M];
	

		for(int i = 0 ; i < H; i++) {
			for(int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				for(int k = 0; k < M; k++) {
					tomato[i][j][k] = Integer.valueOf(st.nextToken());
					if(tomato[i][j][k] == 1) que.offer(new int[] {i , j , k});
				}
			}
		}
		bfs();
		int result = Integer.MIN_VALUE;
		Loop1:
		for(int i = 0 ; i < H; i++) {
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < M; k++) {
					if(tomato[i][j][k] == 0) {
						System.out.println(-1);
						return;
					};
					result = Math.max(result, tomato[i][j][k]);
				}
			}
		}
		if(result == 1) System.out.println(0);
		else System.out.println(result - 1); 

	}
	
	public static void bfs() {
		while(!que.isEmpty()) {
			int[] q = que.poll();
			int queH = q[0];
			int queR = q[1];
			int queC = q[2];
			
			for(int i = 0 ; i < 6; i++) {
				int nextH = queH + moveH[i];
				int nextR = queR + moveR[i];
				int nextC = queC + moveC[i];
				
				if(nextH >= 0 && nextR >= 0 && nextC >= 0 && nextH < H && nextR < N && nextC < M) {
					if(tomato[nextH][nextR][nextC] == 0) {
						tomato[nextH][nextR][nextC] =  tomato[queH][queR][queC] + 1;
						que.offer(new int[] {nextH , nextR , nextC});
					}
				}
			}
		}
		
	
	}
}
	