package programmers.book.graph;
import java.util.*;

public class Graph_06 {
	   static int[][] dist;
	    static int[] mx = {1 , 0 , -1 , 0};
	    static int[] my = {0 , 1 , 0 , -1};
	    
	    public int solution(int[][] board) {
	        int answer = 0;
	        int N = board.length;
	        int M = board[0].length;
	        dist = new int[N][M];
	        for (int i = 0; i < N; i++) {
	            Arrays.fill(dist[i], Integer.MAX_VALUE);
	        }                
	        
	        ArrayDeque<Node> que = new ArrayDeque<Node>();
	        dist[0][0] = 0;
	        que.offer(new Node(0 , 0 , -1 , 0));
	        
	        while(!que.isEmpty()) {
	            Node now = que.poll();
	            
	            for(int i = 0; i < 4; i++) {
	                int nextX = mx[i] + now.x;
	                int nextY = mx[i] + now.y;
	                
	                if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) continue;
	                
	                int nextCost = calculateCost(now.direction , i);
	                
	                if(dist[nextX][nextY] < now.cost + nextCost) continue; 

	                dist[nextX][nextY] = now.cost + nextCost;
	                que.add(new Node(nextX , nextY, i , dist[nextX][nextY]));
	                System.out.println()
	            }
	        }
	        
	            
	        return dist[N-1][M-1];
	    }
	    
	    private static int calculateCost(int preDirection , int nowDirection) {
	        if(preDirection == -1) return 100;
	        return (preDirection - nowDirection % 2 == 0) ? 100 : 500;
	    }
	    private static class Node{
	        int x , y , direction , cost;
	        
	        public Node(int x , int y , int direction , int cost) {
	            this.x = x;
	            this.y = y;
	            this.direction = direction;
	            this.cost = cost;
	        }
	    }
	    
}
