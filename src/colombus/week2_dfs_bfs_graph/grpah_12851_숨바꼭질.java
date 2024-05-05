package colombus.week2_dfs_bfs_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 
//핵심 개념 : bfs 알고리즘
//예상 시간복잡도 : 
//오답노트 -> 
public class grpah_12851_숨바꼭질 {
	static int cnt = 0;
	static int ans = Integer.MAX_VALUE;
	static int N , K;
	static boolean[] visited; 
	public static void main(String[] args) throws Exception {
		BufferedReader  br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.valueOf(st.nextToken());
		K = Integer.valueOf(st.nextToken());
		visited = new boolean[100001];
		bfs(N);
		System.out.println(cnt);
		System.out.println(ans);	
	}
	
	static void bfs(int subin) {
		Queue<int[]> que = new LinkedList<int[]>();
		int[] first = new int[] {subin , 0}; //{현재위치 , 경과 시간}
		que.offer(first);
		while(!que.isEmpty()) {
			int[] queInfo = que.poll();
			int queNow = queInfo[0];
			int queSecond = queInfo[1];
			if(queNow == K) {
				if(ans > queSecond) {
					ans = queSecond;
					cnt = 1;
				}else if(ans == queSecond) {
					cnt++;
				}
				continue;
			}else if(queSecond > ans) break;
			if(queNow + 1 >= 0 && queNow + 1 <= 100000)	que.offer(new int[] {queNow + 1 , queSecond + 1});
			if(queNow - 1 >= 0 && queNow - 1 <= 100000) que.offer(new int[] {queNow - 1 , queSecond + 1});
			if(queNow * 2 >= 0 && queNow * 2 <= 100000) que.offer(new int[] {queNow * 2 , queSecond + 1});
		}
	}
}
	