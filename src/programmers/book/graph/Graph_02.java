package programmers.book.graph;
import java.util.*;

public class Graph_02 {
	   public int solution(int[][] maps) {
	        int answer = 0;
	        int n = maps.length;
	        int m = maps[0].length;
	        
	        boolean[][] visited = new boolean[n][m];
	        int[] x = {1,0,-1,0};
	        int[] y = {0,1,0,-1};
	        
	        ArrayDeque<Node> que = new ArrayDeque<Node>();
	        
	        que.offer(new Node(0 , 0 , 1));
	        visited[0][0] = true;
	        
	        while(!que.isEmpty()) {
	            Node now = que.poll();
	            if(now.x == n - 1 && now.y == m - 1) return now.dist;
	            
	            for(int i = 0; i < 4; i++) {
	                int nextX = now.x + x[i];
	                int nextY = now.y + y[i];
	                
	                
	                if(nextX >= 0 && nextX < n && nextY >= 0 && nextY < m) {

	                    if(!visited[nextX][nextY] && maps[nextX][nextY] == 1) { //방문할 수 있는 조건
	                        visited[nextX][nextY] = true;
	                        int nextDist = now.dist + 1;
	                        que.offer(new Node(nextX , nextY , nextDist));
	                    }
	                }
	            }
	        }
	    
	        return -1;
	    }
	    
	    private static class Node {
	        int x , y , dist;
	        
	        public Node(int x , int y , int dist) {
	            this.x = x;
	            this.y = y;
	            this.dist = dist;
	        }
	    }
}
