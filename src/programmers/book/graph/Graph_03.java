package programmers.book.graph;
import java.util.*;

public class Graph_03 {
	   private static ArrayList<Integer>[] graph;  
	    private static boolean[] visited;
	    
	    public int solution(int n, int[][] computers) {
	        int answer = 0;
	        visited = new boolean[n];
	        
	        for(int i = 0; i < n; i++) {
	            if(!visited[i]) {
	                answer++;
	                dfs(i , computers);
	            }
	        }
	        
	        return answer;
	    }
	    
	    public static void dfs(int node , int[][] computers) {
	        visited[node] = true;
	            
	        for(int i = 0; i < computers[node].length; i++) {
	                if(!visited[i] && computers[node][i] == 1 ) {
	                    dfs(i , computers);
	                }
	        }
	    }
}
