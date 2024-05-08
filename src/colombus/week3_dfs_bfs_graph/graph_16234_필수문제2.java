package colombus.week3_dfs_bfs_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 인구 이동 문제
//핵심 개념 : bfs 알고리즘
//예상 시간복잡도 : 
//오답노트 -> 
public class graph_16234_필수문제2 {
	public static int N , L , R;
	public static int[][] country;
	public static boolean[][] visited;
	public static boolean isMove;
	public static int cnt = 0;
	public static int[] moveR = {1 , 0 , -1 , 0}; // 행
	public static int[] moveC = {0 , 1 ,  0 ,-1}; // 열
	public static ArrayList<int[]> moveCountry;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.valueOf(st.nextToken());
		L = Integer.valueOf(st.nextToken());
		R = Integer.valueOf(st.nextToken());
		
		country = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				country[i][j] = Integer.valueOf(st.nextToken()); 
			}
		}
		
		while(true) { // 한 번의 인구이동은 전체 나라 배열에 bfs를 돌리는 것 
			isMove = false; // 인구이동이 없어지면 끝
			visited = new boolean[N][N];
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(!visited[i][j]) {
						bfs(i , j);
					}
				}
			}
			if(!isMove) break; // 인구이동이 없으면 끝
			cnt++;
		}
		System.out.println(cnt);
	}
	
	public static void bfs(int i , int j) {
		moveCountry = new ArrayList<int[]>();

		Queue<int[]> que = new LinkedList<int[]>();
		que.offer(new int[] {i , j});
		visited[i][j] = true;
		moveCountry.add(new int[] {i , j});

		while(!que.isEmpty()) {
			int[] qNum = que.poll();
			int qRow = qNum[0];
			int qCol = qNum[1];
			for(int k = 0 ; k < 4; k++) {
				int nextR = qRow + moveR[k];
				int nextC = qCol + moveC[k];
				
				if(nextR >= 0 && nextC >= 0 && nextR < N && nextC < N) {
					if(!visited[nextR][nextC] && Math.abs(country[nextR][nextC] - country[qRow][qCol]) >= L && Math.abs(country[nextR][nextC] - country[qRow][qCol]) <= R) {
						visited[nextR][nextC] = true;
						isMove = true;
						moveCountry.add(new int[] {nextR , nextC});
						que.add(new int[] {nextR , nextC});
					}
				}
			}
		}
		
		//인접한 나라 끝날때마다 연합의 인구수 / 연합을 이루고 있는 칸의 개수 구해서 나라 배열 값 변경
		int size = moveCountry.size();
		int sum = 0;
		for(int k = 0; k < size; k++) {
			int[] ans = moveCountry.get(k);
			sum += country[ans[0]][ans[1]];
		}
		
		for(int k = 0; k < size; k++) {
			int[] ans = moveCountry.get(k);
			country[ans[0]][ans[1]] = sum / size;
		}
	}
}
	