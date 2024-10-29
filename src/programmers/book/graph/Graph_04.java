package programmers.book.graph;
import java.util.*;

public class Graph_04 {
	  public int solution(int N, int[][] road, int K) {
	        int answer = 0;
	        int[] dist = new int[N + 1];
	        
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
     
	        Arrays.fill(dist , Integer.MAX_VALUE);
     
	        PriorityQueue<Node> que = new PriorityQueue<Node>((o1,o2) -> Integer.compare(o1.cost,o2.cost));
	        
	        que.offer(new Node(1 , 0));
	        dist[1] = 0;
     
	        while(!que.isEmpty()) {
	            Node now = que.poll();
	            
              for(Node next : graph[now.num]) {
                  if(dist[next.num] > dist[now.num] + next.cost) {
                      dist[next.num] = dist[now.num] + next.cost;
                      que.offer(next);
                  } 
              }
	        }
          
          for(int x : dist) {
              if(x <= K) {
                  answer++;
              }
          }
	        return answer;
	    }
	    
	    private static class Node {
	        int num , cost;
	        
	        public Node(int num , int cost) {
	            this.num = num;
	            this.cost = cost;
	        }
	    }
}
