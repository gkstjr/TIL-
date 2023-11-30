package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

// 브루트 포스로 순열 구하기
// prevPurmutation

public class graph_7562 { 
	static final int[] dx = {2 , 2, 1 , 1 , -1 , -1 , -2 , -2};
	static final int[] dy = {-1 , 1 , -2 , 2 , 2 , -2 ,1 , -1};
	static int N;
	static int[][] list;  
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int t = 0 ; t < T; t++) {
			N = Integer.parseInt(br.readLine());
			
			list = new int[N][N];
			Queue<Integer> que = new LinkedList<Integer>();
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			
			st= new StringTokenizer(br.readLine());
			
			int lastX = Integer.parseInt(st.nextToken());
			int lastY = Integer.parseInt(st.nextToken());
			if(x == lastX && y == lastY) {
				sb.append(0).append("\n"); 
				continue;
			}else {				
				que.offer(x); que.offer(y);
			}

			
			while(!que.isEmpty()) {
				int queX = que.poll();
				int queY = que.poll();
				
				for(int i = 0 ; i < 8; i ++) {
					int nextX = queX + dx[i];
					int nextY = queY + dy[i];
					
					if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < N) {
						if(list[nextX][nextY] == 0) {
							list[nextX][nextY] = list[queX][queY] + 1;
							if(nextX == lastX && nextY == lastY) que.clear();; 
							que.offer(nextX); que.offer(nextY);
						}
					}
				}
			}
			
			sb.append(list[lastX][lastY]).append("\n");
		}
		System.out.println(sb);
	}
	
	
 	
}
