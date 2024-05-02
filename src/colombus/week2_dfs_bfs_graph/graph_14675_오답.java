package colombus.week2_dfs_bfs_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 :
//핵심 개념 : dfs / bfs 알고리즘
//예상 시간복잡도 : 
//오답노트 ->
//처음에는 dfs로 모든 정점을 탐색하는 방법으로 했지만 N이 100000개에 dfs 재귀함수까지 도니 시간초과가 나왔다. 접근 방법을 잘못 생각하였다 -> tree의 특징을 알고 있었으면 좀 더 쉽게 풀었을 수 있었다.
/*
이 문제를 푸는데 필요한 트리의 성질은 다음과 같다.

1. 트리는 사이클이 없고, 모든 정점이 연결되어 있다. (문제에 나와있다.)
2. N개의 정점이 있을때 N-1개의 간선을 가진다. 

우선, t에 2가 입력되었을 때를 먼저 살펴보쟈. t가 2라는건 간선을 하나 지운다는 의미이다. 

현재 트리인 상태에서 어떠한 간선을 하나 지우면 항상 두개의 트리로 나눠질 수 밖에 없다. 

그러므로 항상 yes를 출력한다.

t에 1이 입력된 경우를 생각해보자. 1이라는건 정점을 하나 지운다는 의미이다. 

이때는 두 가지 경우가 발생할 수 있다.

1. 루트, 리프 정점을 삭제한 경우
2. 루트, 리프 정점이 아닌 정점을 삭제한 경우
1번이라면 삭제 후에 두개의 트리로 나눠질 수 없고, 2번이라면 삭제 후 두개의 트리로 나눠질 수 있다.
*/
 
public class graph_14675_오답 {
	static ArrayList[] graph;
	static ArrayList[] tempGraph;
	static boolean[] removed; //정점 삭제시 true 
	static boolean[] visited;
	static int N;
	static int cnt; //2개 이상이면 yes 아니면 no
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.valueOf(br.readLine());
		
		StringTokenizer st;
		graph = new ArrayList[N + 1];
		
		for(int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			
			graph[a].add(b);
			graph[b].add(a);
		}
		
		int K = Integer.valueOf(br.readLine());
		StringBuilder sb= new StringBuilder();
		for(int i = 0 ; i < K; i++) {
			tempGraph = graph;
			visited = new boolean[N + 1];
			removed = new boolean[N + 1];
			cnt = 0;
			st = new StringTokenizer(br.readLine());
			int t = Integer.valueOf(st.nextToken()); // 질의 유형 1 - 정점 삭제 2 - 간선 삭제
			int k = Integer.valueOf(st.nextToken());
			
			if(t == 1) {
				removed[k] = true;
			}else {
				graph[k].clear();
			}
			
			for(int j = 1; j < N + 1; j++) {
				if(!removed[j] && !visited[j]) {
					dfs(j);
					cnt++;
				}
			}
			sb.append((cnt >= 2) ? "yes" : "no").append("\n");	
		}
		
		System.out.println(sb);
	}
	
	public static void dfs(int n) {
		visited[n] = true;
		ArrayList<Integer> neigh = tempGraph[n];
		for(int i = 0; i < neigh.size(); i++) {
			int nextN = neigh.get(i);
			
			if(!visited[nextN] && !removed[nextN]) {
				dfs(nextN);
			}
		}
	}
}
	