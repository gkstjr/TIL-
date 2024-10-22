package programmers.book.graph;
import java.util.*;

public class Graph_basic2 {
	static ArrayList[] graph;
	static boolean[] visited;
	static ArrayList<Integer> answer = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		int[][] arr = {{1,2},{1,3},{2,4}, {2,5},{3,6},{3,7},{4,8},{5,8},{6,9},{7,9}};
		int[][] arr2 = {{1,3},{3,4},{3,5}, {5,2}};

		int start = 1;
		int n = 5;
		graph = new ArrayList[n + 1];
		visited = new boolean[n + 1];
		
		for(int i = 1 ; i < n + 1; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		
		for(int[] edge : arr2) {
			int node1 = edge[0];
			int node2 = edge[1];
			
			graph[node1].add(node2);
		}
		
		bfs(start);
		
		for(int x : answer) {
			System.out.print(x + " ");
		}
 	}
	
	public static void bfs(int start) {
		Queue<Integer> que = new ArrayDeque<>();
		que.add(start);
		answer.add(start);
		visited[start] = true;
		
		while(!que.isEmpty()) {
			int node = que.poll();
			ArrayList<Integer> edges = graph[node];
			
			for(int edge : edges) {
				if(!visited[edge]) {
					que.add(edge);
					answer.add(edge);
					visited[edge] = true;
				}
			}
		}
		
	}
	

	public static int[] solution(int[] arr) {
		
		
		return arr;
	}
}
