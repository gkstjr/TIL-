package colombus.week2_dfs_bfs_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 트리의 부모를 찾는 문제 
//핵심 개념 : dfs / bfs 알고리즘 
//예상 시간복잡도 :
//오답노트 -> 
public class graph_11725_필수문제 {
	static int N;
	static boolean[] visited; //방문여부
	static ArrayList[] node;  //list 배열(인접 리스트)
	static StringBuilder sb = new StringBuilder();
	static int[] ans ;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.valueOf(br.readLine());
		node = new ArrayList[N + 1];
		visited = new boolean[N + 1];
		StringTokenizer st;
		ans = new int[N + 1];
		
		for(int i = 0; i < N + 1; i++) { // node 배열요소마다 ArrayList 생성
			node[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < N - 1 ; i++) {// 인접 노드 설정
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			
			node[a].add(b);
			node[b].add(a);
		}
		
		dfs(1, 0);
		for(int i = 2; i < N + 1; i++) {
			sb.append(ans[i]).append("\n");
		}
		System.out.println(sb);
	}
	
	public static void dfs(int n , int parentN) { //dfs함수 호출시마다 부모 노드 저장
		visited[n] = true;
		ans[n] = parentN; //n의부모를 ans 배열에 저장

		ArrayList<Integer> neighbor = node[n];
		for(int i = 0 ; i < neighbor.size(); i++) {
			int nextN = neighbor.get(i);
			if(!visited[nextN]) { //인접 노드가 아직 방문하지 않았을 때
				dfs(nextN , n);

			}
		}
	}
}
	