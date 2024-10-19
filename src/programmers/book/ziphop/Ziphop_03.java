package programmers.book.ziphop;
import java.util.*;

public class Ziphop_03 {
	 static int[] parent;
	    public int solution(int n, int[][] costs) {
	        int answer = 0;
	        parent = new int[n];
	        for(int i = 0 ; i < n; i++) {
	            parent[i] = i;
	        }
	        
	        Arrays.sort(costs , (o1 , o2) -> Integer.compare(o1[2] , o2[2]));
	        int edges = 0;
	        
	        for(int[] edge : costs) {
	            if(edges == n - 1) break;
	            
	            if(find(edge[0]) != find(edge[1])) {
	                union(edge[0] , edge[1]);
	                edges++;
	                answer+= edge[2];
	            }
	        }
	        
	        return answer;
	    }
	    
	    public static int find(int x) {
	        if(parent[x] == x) return x;
	        return find(parent[x]);
	    } 
	    
	    public static void union(int x , int y) {
	        int root1 = find(x);
	        int root2 = find(y);
	        
	        parent[root2] = root1;
	    }
}
