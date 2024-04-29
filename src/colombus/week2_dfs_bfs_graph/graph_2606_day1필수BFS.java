package colombus.week2_dfs_bfs_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 네트워크가 연결되어 있는 컴퓨터중에 한 개의 컾뮤터의 바이러스가 걸렸을 때 나머지 연결된 네트워크들도 바이러스가 걸린다고 할 때 바이러스 걸린 컴퓨터 개수 구하기
//핵심 개념 : DFS , BFS 알고리즘 둘 다 사용해보기
//예상 시간복잡도 : 
//오답노트 -> 
public class graph_2606_day1필수BFS {
	static ArrayList[] node; //인접리스트로 구현
	static int answer = 0;  // dfs 함수를 통한 호출 개수
	static boolean[] visited;// 해당 노드 방문여부 
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.valueOf(br.readLine());
		int v = Integer.valueOf(br.readLine());
		visited = new boolean[n + 1];
		node = new ArrayList[n + 1];
		
		for(int i = 0; i <= n; i++) {
			node[i] = new ArrayList<Integer>(); 
		}
		
		for(int i = 1; i <= v; i++) { // 연결 노드 설정
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			
			node[a].add(b);
			node[b].add(a);
		}
		
		Bfs(1);
		System.out.println(answer);
	}
	
	public static void Bfs(int n) {
		Queue<Integer> que = new LinkedList<Integer>();
		visited[n] = true;
		que.offer(n);

		while(!que.isEmpty()) {
			int num = que.poll();
			ArrayList<Integer> list = node[num];
			for(int i = 0 ; i < list.size(); i++) {
				if(!visited[list.get(i)]) {
					answer++;
					visited[list.get(i)] = true;
					que.offer(list.get(i));
				}
			}
		}
	}
}
	