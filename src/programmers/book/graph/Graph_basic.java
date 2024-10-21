package programmers.book.graph;
import java.util.*;

public class Graph_basic {
	static 		ArrayList[] graph;

	static ArrayList<Integer> answer = new ArrayList<Integer>();
	static boolean[] visited;


	public static void main(String[] args) {
		int[][] arr = {{1,2},{2,3},{3,4}, {4,5}};
		int start = 1;
		int n = 5;
		
		int[][] arr2 = {{1,2},{1,3},{2,4}, {2,5}, {3,6} , {5,6}};
		int start2 = 1;
		int n2 = 6; 

		int[] answer2 = solution(arr2,start2,n2);
		
		for(int x : answer2) {
			System.out.print(x + " ");
		}
	}

	public static int[] solution(int[][] arr , int start , int n) {
		visited = new boolean[n + 1];
		graph =  new ArrayList[n + 1];
		
		for(int i = 1; i < graph.length; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < arr.length; i++) {
			int node1 = arr[i][0];
			int node2 = arr[i][1];
			
			graph[node1].add(node2);
			graph[node2].add(node1);
		}
		
		dfs(start);
		
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
	
	public static void dfs(int node) {
		if(visited[node]) return;
		answer.add(node);
		visited[node] = true;
		ArrayList<Integer> nei = graph[node];
		
		for(int i = 0; i < nei.size(); i++) {
			if(!visited[nei.get(i)]) {
				dfs(nei.get(i));
			}
		}
	}
}
