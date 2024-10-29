package programmers.book.graph;
import java.util.*;

public class Graph_06 {
	   static ArrayList<Integer>[] graph;
	    static boolean[] visited;
	    static int answer = Integer.MAX_VALUE;
	    static int N;
	    
	    public int solution(int n, int[][] wires) {
	        graph = new ArrayList[n + 1];
	        visited = new boolean[n + 1];
	        N = n;
	        
	        for(int i = 1; i < n + 1; i++) {
	            graph[i] = new ArrayList<Integer>();
	        }
	        
	        for(int[] i : wires) {
	            int x = i[0];
	            int y= i[1];
	            
	            graph[x].add(y);
	            graph[y].add(x);
	        }
	        dfs(1);
	        return answer;
	    }
	    
	    public static int dfs(int node) {
	        visited[node] = true;
	        int sum = 0;
	        
	        for(int next : graph[node]) {
	            if(!visited[next]) {
	                int cnt = dfs(next);
	                answer = Math.min(answer , Math.abs(N - 2 * cnt));
	                sum += cnt;
	            }    
	        }
	        
	        return sum + 1;
	    }
	    
}
