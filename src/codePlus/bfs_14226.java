package codePlus;

import java.util.*;
import java.io.*;
import java.nio.Buffer;


public class bfs_14226 { 
	static int[][] dist = new int[1001][1001];
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int S = Integer.parseInt(br.readLine());
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		que.offer(1); que.offer(0);//화면에 있는 거 먼저
		
		
		while(!que.isEmpty()) {
			int i = que.poll(); // 화면 이모티콘 수
			int j = que.poll();	// 클립보드 이모티콘 수
			
			//화면에 있는 이모티콘 모두 복사 클립보드 저장
			if(dist[i][i] == 0) {
				dist[i][i] = dist[i][j] + 1;
				que.offer(i); que.offer(i);
			}
			//클립보드에 있는 모든 이모티콘 화면에 붙여넣기.
			if(i + j <= S && dist[i + j][j] == 0) {
				dist[i + j][j] = dist[i][j] + 1;
				que.offer(i + j); que.offer(j);
			}
			
			if(i - 1 >= 0 && dist[i - 1][j] == 0) {
				dist[i - 1][j] = dist[i][j] + 1;
				que.offer(i - 1); que.offer(j);
			}
		}
		int ans = Integer.MAX_VALUE;
		for(int i = 0 ; i <= S; i++) {
			if(ans > dist[S][i] && dist[S][i] != 0) {
				ans = dist[S][i];
			}
		}
		
		System.out.println(ans);
	}
	
 }
