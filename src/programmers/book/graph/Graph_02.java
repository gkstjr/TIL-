package programmers.book.graph;
import java.util.*;

public class Graph_02 {
	public static void main(String[] args) {
		int[][] road = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
		solution(5 , road , 3);
	}
	   public static int solution(int N, int[][] road, int K) {
	        int answer = 1;
	        int[] dist = new int[N + 1];
	        boolean[] visited = new boolean[N + 1];
	        ArrayList<Node>[] graph = new ArrayList[N + 1];
	        
	        for(int i = 1; i < N + 1; i++) {
	            graph[i] = new ArrayList<Node>();
	        }
	        
	        for(int i = 0; i < road.length; i++) {
	            int node1 = road[i][0];
	            int node2 = road[i][1];
	            int ds = road[i][2];
	                
	            graph[node1].add(new Node(node2 , ds));
	            graph[node2].add(new Node(node1 , ds));
	        }
	        
	        for(int i = 1; i < N + 1; i++) {
	            Collections.sort(graph[i], (o1, o2) -> Integer.compare(o1.road, o2.road));
	        }
	        
	        ArrayDeque<Node> que = new ArrayDeque<Node>();
	        
	        que.offer(new Node(1 , 0));
	        visited[1] = true;
	        
	        while(!que.isEmpty()) {
	            Node now = que.poll();
	            
	            for(Node next : graph[now.num]) {
	                if(!visited[next.num] && (dist[now.num] + next.road) <= K) {
	                    visited[next.num] = true;
	                    answer++;
	                    dist[next.num] = dist[now.num] + next.road;
	                }
	            }
	        }
	        return answer;
	    }
	    
	    private static class Node {
	        int num , road;
	        
	        public Node(int num , int road) {
	            this.num = num;
	            this.road = road;
	        }
	    }
}
