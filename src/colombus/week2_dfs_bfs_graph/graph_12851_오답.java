package colombus.week2_dfs_bfs_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 
//핵심 개념 : dfs / bfs 알고리즘
//예상 시간복잡도 : 
//오답노트 -> 
public class graph_12851_오답 {
	static int[] time = new int[100001];
	static int N , K;
	static int cnt;
	static int[] move = {1 , -1 , 2};
	static int minTime = Integer.MAX_VALUE;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.valueOf(st.nextToken());
		K = Integer.valueOf(st.nextToken());
		
		bfs();
		System.out.println(time[K]);
		System.out.println(cnt);
	}
	
	static void bfs() {
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(N);
		
		if (N==K) {
			cnt++;
			return; 
		}
		
		while(!que.isEmpty()) {
			int now = que.poll();
			
			for(int i = 0 ; i < 3; i++) {
				int next;
				next = now + move[i];
				if(i == 2) next = now * move[i];
			
				if(next > 0 && next <= 100000 && time[next] >= time[now] + 1) {
					que.offer(next);
					time[next] = time[now] + 1;
					if(next == K) cnt++;
				}
			}
		}
	}
}
	