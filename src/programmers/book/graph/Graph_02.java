package programmers.book.graph;
import java.util.*;

public class Graph_02 {
	   static int n , m;
	    static char[][] graph;
	    static int[] mx = {0,0,-1,1};
	    static int[] my = {1,-1,0,0};

	    public int solution(String[] maps) {
	        n = maps.length;
	        m = maps[0].length();
	        
	        graph = new char[n][m];
	        Node start = null , end = null , lever = null;
	        
	        for(int i = 0; i < maps.length; i++) {
	            graph[i]  = maps[i].toCharArray();
	        }
	        
	        for(int i = 0; i < n; i++) {
	            for(int j = 0; j < m; j++) {
	                char ch = graph[i][j];
	                if(ch == 'S') start = new Node(i , j);
	                else if(ch == 'L') lever = new Node(i , j);
	                else if(ch == 'E') end = new Node(i , j);
	            }
	        }
	        
	        int startLever = bfs(start , lever);
	        System.out.println("================");
	        int leverEnd = bfs(lever , end);
	        
	        if(startLever == -1 || leverEnd == -1) return -1;
	        
	        return startLever + leverEnd;
	    }
	    
	    public static int bfs(Node start , Node end) {
	        boolean[][] visited = new boolean[n][m];
	        int[][] answer = new int[n][m];
	        visited[start.x][start.y] = true;
	        ArrayDeque<Node> que = new ArrayDeque<Node>();
	        que.offer(start);
	        
	        while(!que.isEmpty()) {
	            Node now = que.poll();
	            
	            for(int i = 0; i < 4; i++) {
	                int nextX = now.x + mx[i]; 
	                int nextY = now.y + my[i];
	                
	                if(nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) continue;
	                
	                if(visited[nextX][nextY] || graph[nextX][nextY] == 'X') continue;
	                
	                visited[nextX][nextY] = true;
	                answer[nextX][nextY] = answer[now.x][now.y] + 1;
	                que.offer(new Node(nextX , nextY));
	                if(nextX == end.x && nextY == end.y) {
	                    return answer[end.x][end.y];
	                }
	            }
	        }
	        return -1;
	    }
	    
	    private static class Node {
	        int x , y;
	        
	        public Node(int x , int y) {
	            this.x = x;
	            this.y = y;
	        }
	    }
}
