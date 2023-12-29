package codePlus;

import java.util.*;
import java.io.*;
import java.nio.Buffer;


public class bfs_1697 { 
	static int max = 100000;
	static int[] dist = new int[100001];
	static int N;
	static int K;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		bfs(N);
		
		System.out.println(dist[K]);
	}
	
	static void bfs(int x) {
		
		dist[x] = 0;
		
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(x);
		
		while(!que.isEmpty()) {
			
			int queX = que.poll();
			if(queX == K) break;
			
			if(queX - 1 >= 0) {
				if(dist[queX - 1] == 0) {
					dist[queX - 1] = dist[queX] + 1;
					que.offer(queX - 1);
				}
			}
			
			if(queX + 1 <= max) {
				if(dist[queX + 1] == 0) {
					dist[queX + 1] = dist[queX] + 1;
					que.offer(queX + 1);
				}
			}
			
			if(queX * 2 <= max) {
				if(dist[queX * 2] == 0) {
					dist[queX * 2] = dist[queX] + 1;
					que.offer(queX * 2);
				}
			}
		}
	}
	
}
