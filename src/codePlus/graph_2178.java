package codePlus;

import java.util.*;
import java.io.*;
import java.nio.Buffer;


public class graph_2178 { 
	static int[][] list;
	static boolean[][] check;
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	static int[][] ans;
	static int N;
	static int M;
	static int ansNum;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken()); //행 
		M = Integer.parseInt(st.nextToken()); //열
		
		list = new int[N][M];
		check = new boolean[N][M];
		ans = new int[N][M];
		for(int i = 0 ; i < N; i++) {
			String str = br.readLine();
			for(int j = 0; j < M; j++) {
				list[i][j] = str.charAt(j) - '0';
			}
		}
		if(!check[0][0] && list[0][0] == 1) {
			ans[0][0] = 1;
			bfs(0 , 0);
		}
		System.out.println(ans[N - 1][M - 1]);
	}
	
	static void bfs(int i , int j) {
		check[i][j] = true;
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(i); que.offer(j);
		
		while(!que.isEmpty()) {
			int queI = que.poll(); int queJ = que.poll();

			for(int k = 0 ; k < 4; k++) {
				int nextI = queI + dy[k];
				int nextJ = queJ + dx[k];
			
				if(nextI >= 0 && nextI < N && nextJ >= 0 && nextJ < M) {
					if(!check[nextI][nextJ] && list[nextI][nextJ] == 1) {
						check[nextI][nextJ] = true;
						que.offer(nextI); que.offer(nextJ);
						ans[nextI][nextJ] = ans[queI][queJ] + 1;
					}
				}
			}
			
		}
	}
}
