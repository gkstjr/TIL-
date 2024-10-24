package programmers.book.graph;
import java.util.*;

public class Graph_01 {
	public static void main(String[] args) {
		int[][] arr = {{0,1,1},{1,2,5},{2,3,1}};
		
		solution(arr,0,4);
	}

	public static int[] solution(int[][] arr , int start , int n) {
		int[] answer = new int[n];
		ArrayList<Node>[] graph = new ArrayList[n];
		boolean[] visited = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			graph[i] = new ArrayList<Node>();
		}
		
		for(int[] edge : arr) {
			graph[edge[0]].add(new Node(edge[1],edge[2]));
		}
		
		PriorityQueue<Node> que = new PriorityQueue<Node>((o1,o2) -> Integer.compare(o1.cost, o2.cost));
		
		Arrays.fill(answer, Integer.MAX_VALUE);
		answer[0] = 0;
		
		que.add(new Node(start, 0));
		
		while(!que.isEmpty()) {
			Node now = que.poll();
			
			if(visited[now.dest]) continue;
			
			visited[now.dest] = true;
		
			for(Node next : graph[now.dest]) {
				if(answer[next.dest] > answer[now.dest] + next.cost) {
					System.out.println(next.dest +" / " + now.cost + "/ " + next.cost);
					answer[next.dest] = answer[now.dest] +next.cost;
					que.offer(new Node(next.dest , next.cost));
				}
			}
		}
		
		for(int x : answer) {
			System.out.print(x + " ");
		}
		return answer;
	}
	
	
	private static class Node {
		int dest , cost;
		
		public Node(int dest , int cost) {
			this.dest = dest;
			this.cost = cost;
		}
	}
}
